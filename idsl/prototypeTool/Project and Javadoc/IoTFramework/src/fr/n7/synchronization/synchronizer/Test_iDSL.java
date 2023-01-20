package fr.n7.synchronization.synchronizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * This class loads the main function and is the program entry point.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
public class Test_iDSL {
    /**
     * This field is to describe the Test_iDSL.
     */
    private String description = "";

    /**
     * This method is the program entry point to start the program.
     *
     * @param args console parameters
     * @throws InterruptedException the thread is interrupted when sleeping
     */
    public static void main(String[] args) throws InterruptedException {
        Synchronizer synchronizer = new Synchronizer();
        synchronizer.synchronize();
    }
}

/**
 * This class is a subclass of thread.
 * This class serves as the server side for Socket connection.
 * This class is responsible for connecting ECG devices, obtaining data, and storing data in the SignalWindow.
 * This class provides methods to extract the encapsulated ECG signal data.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class EcgSensor extends Thread{
    /**
     * This field provides the sampling rate of ECG device.
     */
    private int samplingRate = 1024;
    /**
     * This field provides BluetoothEcg object for connection.
     */
    private BluetoothEcg bluetoothEcg;
    /**
     * This field provides EcgSignalWindow object for store and retrieve data.
     */
    private EcgSignalWindow ecgSignalWindow;

    /**
     * This method is a constructor with no parameters.
     *
     */
    public EcgSensor(){
        bluetoothEcg = new BluetoothEcg();
        ecgSignalWindow = new EcgSignalWindow();
    }

    /**
     * This method returns sampling rate of the ECG device.
     *
     * @return int
     */
    public int getSamplingRate() {
        return samplingRate;
    }

    /**
     * This method returns the timestamp of the first ECG signal received.
     *
     * @return long
     */
    public long getFirstSignalClock(){
        return ecgSignalWindow.getSignals().get(0).getTimestamp();
    }

    /**
     * This method returns the local clock time when receiving the first ECG signal.
     *
     * @return long
     */
    public long getFirstMonitorClock(){
        return ecgSignalWindow.getEcgMonitorClock();
    }

    /**
     * This method returns the value of ECG signal with the specified timestamp.
     *
     * @param timestamp given timestamp to find the corresponding value
     * @return double
     */
    public double getOneSignalValue(long timestamp){
        return ecgSignalWindow.getSpeicifiedSignal(timestamp).getValue();
    }

    /**
     * This method returns the duration of the ECG signal window.
     *
     * @return int
     */
    public int getSignalDuration(){
        return ecgSignalWindow.getDuration();
    }

    /**
     * This method returns whether the ECG signals are ready to be synchronized.
     *
     * @return boolean
     */
    public boolean isReadyToSync(){
        return ecgSignalWindow.isFlag();
    }

    /**
     * This method sets the ECG signals ready to be synchronized.
     *
     */
    public void setReadyToSync(){
        ecgSignalWindow.setFlag(true);
    }

    /**
     * This method sets the ECG signals not ready to be synchronized.
     *
     */
    public void setNotReadyToSync(){
        ecgSignalWindow.setFlag(false);
    }

    /**
     * This method is inherited from the Thread to start the thread for connection.
     *
     */
    @Override
    public void run() {
        connectEcg();
    }

    /**
     * This method is responsible to connect to ECG device by Socket.
     *
     */
    private void connectEcg(){
        int PORT = bluetoothEcg.getPort();

        /**
         * This class is an internal class responsible for reading data after establishing a Socket connection.
         *
         * @author Qiyue FAN, Quanrui MU
         * @date 22/07/2021 13:40
         */
        class HandlerThread implements Runnable {
            private Socket socket;
            public HandlerThread(Socket client) {
                socket = client;
                new Thread(this).start();
            }

            /**
             * This method is inherited from the Thread to start the thread for reading messages sent by clients.
             * This method parses the read data and add it to the ECG signal window.
             *
             */
            @Override
            public void run() {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    ecgSignalWindow.clearSignals();

                    long monitor_clock_ecg = 1504;
                    ecgSignalWindow.setEcgMonitorClock(monitor_clock_ecg);

                    while(true){
                        String clientInputStr = bufferedReader.readLine();
                        if(clientInputStr.contains("=")){
                            String[] temp;
                            String delimeter = "=";
                            temp = clientInputStr.split(delimeter);
                            if(temp[0].equals("samplingRate_ecg")){
                                samplingRate = Integer.parseInt(temp[1]);
                            }
                            else if(temp[0].equals("duration_ecg")){
                                ecgSignalWindow.setDuration(Integer.parseInt(temp[1]));
                            }
                            else{
                                ecgSignalWindow.addSignal(Long.parseLong(temp[0]), Double.parseDouble(temp[1]));
                            }
                        }
                        else{
                            setReadyToSync();
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Server run exception: " + e.getMessage());
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (Exception e) {
                            socket = null;
                            System.out.println("Server finally exception:" + e.getMessage());
                        }
                    }
                }
            }
        }

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            while (true) {
                Socket client = serverSocket.accept();
                new HandlerThread(client);
            }
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }

}

/**
 * This class encapsulates a series of information about the signal window.
 * This class can be used by the EcgSensor to store and retrieve data.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class EcgSignalWindow{
    /**
     * This field stores all read signals information.
     */
    private ArrayList<EcgSignal> signals;
    /**
     * This field provides the local clock time when receiving the first ECG signal.
     */
    private long ecgMonitorClock;
    /**
     * This field provides how often the device sends the signals.
     */
    private int period;
    /**
     * This field provides how long each period of sending signals lasts.
     */
    private int duration;
    /**
     * This field determines whether each period of receiving signals ends.
     */
    private boolean flag;

    /**
     * This method is the constructor without parameters.
     *
     */
    public EcgSignalWindow(){
        signals = new ArrayList<>();
        flag = false;
    }

    /**
     * This method returns all stored signals.
     *
     * @return java.util.ArrayList
     */
    public ArrayList<EcgSignal> getSignals() {
        return signals;
    }

    /**
     * This method returns the local clock time when receiving the first ECG signal.
     *
     * @return long
     */
    public long getEcgMonitorClock() {
        return ecgMonitorClock;
    }

    /**
     * This method returns the duration of the ECG signal window.
     *
     * @return int
     */
    public int getDuration() {
        return duration;
    }

    /**
     * This method returns whether a signal reception period is over. 
     *
     * @return boolean
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * This method sets a signal reception period state (over or not).
     *
     * @param flag the symbol to determine whether the signals are ready to be synchronized
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /**
     * This method sets the local clock time when receiving the first ECG signal.
     *
     * @param ecgMonitorClock the local clock time to set
     */
    public void setEcgMonitorClock(long ecgMonitorClock) {
        this.ecgMonitorClock = ecgMonitorClock;
    }

    /**
     * This method sets the duration of ECG signal window.
     *
     * @param duration the duration of the signal window to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * This method returns the signal value with specified timestamp.
     *
     * @param timestamp the timestamp to find the corresponding value of the signal
     * @return fr.n7.synchronizer.transform.EcgSignal
     */
    public EcgSignal getSpeicifiedSignal(long timestamp){
        for(EcgSignal signal: signals){
            if(signal.getTimestamp() == timestamp){
                return signal;
            }
        }
        return null;
    }

    /**
     * This method stores a new signal in the signal window.
     *
     * @param timestamp the identifier of a signal
     * @param value the value of a signal
     */
    public void addSignal(long timestamp, double value){
        signals.add(new EcgSignal(timestamp, value));
    }

    /**
     * This method clears all the signals stored in the signal window.
     *
     */
    public void clearSignals(){
        signals.clear();
    }
}

/**
 * This class encapsulates the signal data of ECG.
 * This class is composition of EcgSignalWindow.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class EcgSignal{
    /**
     * This field represents the timestamp of the signal.
     */
    private long timestamp;
    /**
     * This field represents the timestamp of the signal.
     */
    private double value;

    /**
     * This method is the constructor with timestamp and value.
     *
     * @param timestamp the identifier of a signal
     * @param value the value of a signal
     */
    public EcgSignal(long timestamp, double value){
        this.timestamp = timestamp;
        this.value = value;
    }

    /**
     * This method returns the timestamp of the signal.
     *
     * @return long
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * This method returns the value of the signal.
     *
     * @return double
     */
    public double getValue() {
        return value;
    }
}

/**
 * This class provides the information needed to connect to ECG devices.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class BluetoothEcg {
    /**
     * This field is to describe the BluetoothEcg connection detail.
     */
    private String description = "";
    /**
     * This field provides the port for connection.
     */
    private String port = "12345";
    
    /**
     * This method returns the port of connection to ECG.
     *
     * @return int
     */
    public int getPort() {
        return Integer.parseInt(port);
    }
}

/**
 * This class is a subclass of thread.
 * This class serves as the server side for Socket connection.
 * This class is responsible for connecting EEG devices, obtaining data, and storing data in the SignalWindow.
 * This class provides methods to extract the encapsulated EEG signal data.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class EegSensor extends Thread{
    /**
     * This field provides the sampling rate of EEG device.
     */
    private int samplingRate = 256;
    /**
     * This field provides BluetoothEeg object for connection.
     */
    private BluetoothEeg bluetoothEeg;
    /**
     * This field provides EegSignalWindow object for store and retrieve data.
     */
    private EegSignalWindow eegSignalWindow;

    /**
     * This method is a constructor with no parameters.
     *
     */
    public EegSensor(){
        bluetoothEeg = new BluetoothEeg();
        eegSignalWindow = new EegSignalWindow();
    }

    /**
     * This method returns sampling rate of the EEG device.
     *
     * @return int
     */
    public int getSamplingRate() {
        return samplingRate;
    }

    /**
     * This method returns the timestamp of the first EEG signal received.
     *
     * @return long
     */
    public long getFirstSignalClock(){
        return eegSignalWindow.getSignals().get(0).getTimestamp();
    }

    /**
     * This method returns the local clock time when receiving the first EEG signal.
     *
     * @return long
     */
    public long getFirstMonitorClock(){
        return eegSignalWindow.getEegMonitorClock();
    }

    /**
     * This method returns the value of EEG signal with the specified timestamp.
     *
     * @param timestamp given timestamp to find the corresponding value
     * @return double
     */
    public double getOneSignalValue(long timestamp){
        return eegSignalWindow.getSpeicifiedSignal(timestamp).getValue();
    }

    /**
     * This method returns the duration of the EEG signal window.
     *
     * @return int
     */
    public int getSignalDuration(){
        return eegSignalWindow.getDuration();
    }

    /**
     * This method returns whether the EEG signals are ready to be synchronized.
     *
     * @return boolean
     */
    public boolean isReadyToSync(){
        return eegSignalWindow.isFlag();
    }

    /**
     * This method sets the EEG signals ready to be synchronized.
     *
     */
    public void setReadyToSync(){
        eegSignalWindow.setFlag(true);
    }

    /**
     * This method sets the EEG signals not ready to be synchronized.
     *
     */
    public void setNotReadyToSync(){
        eegSignalWindow.setFlag(false);
    }

    /**
     * This method is inherited from the Thread to start the thread for connection.
     *
     */
    @Override
    public void run() {
        connectEeg();
    }

    /**
     * This method is responsible to connect to EEG device by Socket.
     *
     */
    private void connectEeg(){
        int PORT = bluetoothEeg.getPort();

        /**
         * This class is an internal class responsible for reading data after establishing a Socket connection.
         *
         * @author Qiyue FAN, Quanrui MU
         * @date 22/07/2021 13:40
         */
        class HandlerThread implements Runnable {
            private Socket socket;
            public HandlerThread(Socket client) {
                socket = client;
                new Thread(this).start();
            }

            /**
             * This method is inherited from the Thread to start the thread for reading messages sent by clients.
             * This method parses the read data and add it to the ECG signal window.
             *
             */
            @Override
            public void run() {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    eegSignalWindow.clearSignals();

                    long monitor_clock_eeg = 777;
                    eegSignalWindow.setEegMonitorClock(monitor_clock_eeg);

                    while(true){
                        String clientInputStr = bufferedReader.readLine();
                        if(clientInputStr.contains("=")){
                            String[] temp;
                            String delimeter = "=";
                            temp = clientInputStr.split(delimeter);
                            if(temp[0].equals("samplingRate_eeg")){
                                samplingRate = Integer.parseInt(temp[1]);
                            }
                            else if(temp[0].equals("duration_eeg")){
                                eegSignalWindow.setDuration(Integer.parseInt(temp[1]));
                            }
                            else{
                                eegSignalWindow.addSignal(Long.parseLong(temp[0]), Double.parseDouble(temp[1]));
                            }
                        }
                        else{
                            setReadyToSync();
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Server run exception: " + e.getMessage());
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (Exception e) {
                            socket = null;
                            System.out.println("Server finally exception:" + e.getMessage());
                        }
                    }
                }
            }
        }

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            while (true) {
                Socket client = serverSocket.accept();
                new HandlerThread(client);
            }
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }

}

/**
 * This class encapsulates a series of information about the signal window.
 * This class can be used by the EegSensor to store and retrieve data.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class EegSignalWindow{
    /**
     * This field stores all read signals information.
     */
    private ArrayList<EegSignal> signals;
    /**
     * This field provides the local clock time when receiving the first EEG signal.
     */
    private long eegMonitorClock;
    /**
     * This field provides how often the device sends the signals.
     */
    private int period;
    /**
     * This field provides how long each period of sending signals lasts.
     */
    private int duration;
    /**
     * This field determines whether each period of receiving signals ends.
     */
    public boolean flag;

    /**
     * This method is the constructor without parameters.
     *
     */
    public EegSignalWindow(){
        signals = new ArrayList<>();
        flag = false;
    }

    /**
     * This method returns all stored signals.
     *
     * @return java.util.ArrayList
     */
    public ArrayList<EegSignal> getSignals() {
        return signals;
    }

    /**
     * This method returns the local clock time when receiving the first EEG signal.
     *
     * @return long
     */
    public long getEegMonitorClock() {
        return eegMonitorClock;
    }

    /**
     * This method returns the duration of the EEG signal window.
     *
     * @return int
     */
    public int getDuration() {
        return duration;
    }

    /**
     * This method returns whether a signal reception period is over.
     *
     * @return boolean
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * This method sets a signal reception period state (over or not).
     *
     * @param flag the symbol to determine whether the signals are ready to be synchronized
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /**
     * This method sets the local clock time when receiving the first EEG signal.
     *
     * @param eegMonitorClock the local clock time to set
     */
    public void setEegMonitorClock(long eegMonitorClock) {
        this.eegMonitorClock = eegMonitorClock;
    }

    /**
     * This method sets the duration of EEG signal window.
     *
     * @param duration the duration of the signal window to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * This method returns the signal value with specified timestamp.
     *
     * @param timestamp the timestamp to find the corresponding value of the signal
     * @return fr.n7.synchronizer.transform.EcgSignal
     */
    public EegSignal getSpeicifiedSignal(long timestamp){
        for(EegSignal signal: signals){
            if(signal.getTimestamp() == timestamp){
                return signal;
            }
        }
        return null;
    }

    /**
     * This method stores a new signal in the signal window.
     *
     * @param timestamp the identifier of a signal
     * @param value the value of a signal
     */
    public void addSignal(long timestamp, double value){
        signals.add(new EegSignal(timestamp, value));
    }

    /**
     * This method clears all the signals stored in the signal window.
     *
     */
    public void clearSignals(){
        signals.clear();
    }
}

/**
 * This class encapsulates the signal data of EEG.
 * This class is composition of EegSignalWindow.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class EegSignal {
    /**
     * This field represents the timestamp of the signal.
     */
    private long timestamp;
    /**
     * This field represents the timestamp of the signal.
     */
    private double value;

    /**
     * This method is the constructor with timestamp and value.
     *
     * @param timestamp the identifier of a signal
     * @param value the value of a signal
     */
    public EegSignal(long timestamp, double value){
        this.timestamp = timestamp;
        this.value = value;
    }

    /**
     * This method returns the timestamp of the signal.
     *
     * @return long
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * This method returns the value of the signal.
     *
     * @return double
     */
    public double getValue() {
        return value;
    }
}

/**
 * This class provides the information needed to connect to EEG devices.
 * 
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class BluetoothEeg {
    /**
     * This field is to describe the BluetoothEeg connection detail.
     */
    private String description = "";
    /**
     * This field provides the port for connection.
     */
    private String port = "12346";

    /**
     * This method returns the port of connection to EEG.
     *
     * @return int
     */
    public int getPort() {
        return Integer.parseInt(port);
    }
}

/**
 * This class is the core of the project to finish synchronization.
 * This class obtains and temporarily stores signals through EcgSensor and EegSensor.
 * This class provides methods to synchronize the obtained signals, and outputs the synchronized results.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class Synchronizer{
    /**
     * This field provides the sampling rate of synchronizer.
     */
    private int samplingRate = 2000;
    /**
     * This field provides the EcgSensor object for connection and obtaining data.
     */
    private EcgSensor ecgSensor;
    /**
     * This field provides the EegSensor object for connection and obtaining data.
     */
    private EegSensor eegSensor;
    /**
     * This field provides the Console object for output.
     */
    private static Console console;

    /**
     * This method is the constructor without parameters.
     *
     */
    public Synchronizer(){
        console = new Console();
        ecgSensor = new EcgSensor();
        eegSensor = new EegSensor();
    }

    /**
     * This method starts the threads to connect to devices.
     * This method continuously listens to determine whether the signals from the devices can start synchronization.
     * This method will synchronize the different signals that can are ready to be synchronized and output them.
     *
     * @throws InterruptedException the thread is interrupted when sleeping
     */
    public void synchronize() throws InterruptedException {
        System.out.println("EcgSensor starts...");
        ecgSensor.start();

        System.out.println("EegSensor starts...");
        eegSensor.start();

        while(true){
            Thread.sleep(1000);
            if(ecgSensor.isReadyToSync() && eegSensor.isReadyToSync()){
                signalsSynchronize();
                ecgSensor.setNotReadyToSync();
                eegSensor.setNotReadyToSync();
            }
        }
    }

    /**
     * This method synchronizes and outputs signals by obtaining the necessary parameters of the signal window.
     *
     */
    private void signalsSynchronize(){

        int samplingRate_ecg = ecgSensor.getSamplingRate();
        int samplingRate_eeg = eegSensor.getSamplingRate();

        long local_clock_ecg = ecgSensor.getFirstSignalClock();
        long local_clock_eeg = eegSensor.getFirstSignalClock();

        long monitor_clock_ecg = ecgSensor.getFirstMonitorClock();
        long monitor_clock_eeg = eegSensor.getFirstMonitorClock();

        int duration_ecg = ecgSensor.getSignalDuration();
        int duration_eeg = eegSensor.getSignalDuration();

        //find the first synchronized sample's location in continuous data set, call it "head"  
        long head = findHead(local_clock_eeg,monitor_clock_eeg,samplingRate_eeg,local_clock_ecg,monitor_clock_ecg);

        //excute output 
        console.formattedOutput("EEG head", head, "value", eegSensor.getOneSignalValue(head));
        console.formattedOutput("ECG clock", local_clock_ecg, "value", ecgSensor.getOneSignalValue(local_clock_ecg));

        console.formattedOutput("After synchronization");
        console.formattedOutput("EEG");

        for(int i=0;i<samplingRate_eeg*(duration_ecg/1000);i++){
            console.formattedOutput("time stamp", (head+(1000 / samplingRate_eeg + 1) * i), "value", eegSensor.getOneSignalValue(head + (1000 / samplingRate_eeg + 1) * i));
        }

        System.out.println("ECG:");
        for(int i=0;i<samplingRate_ecg*(duration_ecg/1000);i++){
            console.formattedOutput("time stamp", (local_clock_ecg+(1000 / samplingRate_ecg + 1) * i), "value", ecgSensor.getOneSignalValue(local_clock_ecg + (1000 / samplingRate_ecg + 1) * i));
        }
    }

    /**
     * This method uses necessary parameters to find the local timestamp of the continuous signal that actually corresponds to the clock discontinuous.
     *
     * @param local_clock_continuous the timestamp of the first continuous signal received
     * @param monitor_clock_continuous the local clock time when receiving the first continuous signal
     * @param samplingRate_continuous the sampling rate of the continuous signal
     * @param local_clock_discontinuous the timestamp of the first discontinuous signal received
     * @param monitor_clock_discontinuous the local clock time when receiving the first discontinuous signal
     * @return long
     */
    private static long findHead(long local_clock_continuous, long monitor_clock_continuous, int samplingRate_continuous, long local_clock_discontinuous, long monitor_clock_discontinuous){

        console.formattedOutput("local_clock_continuous", local_clock_continuous,
                "monitor_clock_continuous", monitor_clock_continuous,
                "samplingRate_continuous", samplingRate_continuous,
                "local_clock_discontinuous",  local_clock_discontinuous,
                "monitor_clock_discontinuous", monitor_clock_discontinuous);

        //"head" is the local timestamp of the continuous signal that actually corresponds to the clock_discontinuous  
        long head = 0;

        //translate sampling rate(Hz) into milliseconds(ms)  
        int samplingInterval = 1000/samplingRate_continuous + 1;

        //When we try to find the clock that actually corresponds to the clock_discontinuous by using the two offsets,  
        //the result (call it actual_continuous) may not correspond to any sample in ecg data due to the sampling rate, so we need to  
        //find the closest timestamp in ecg data, this forward time difference indicates that we found a closest timestamp that is  
        //located on the right side of the "actual_continuous", so we have: head = actual_continuous + timeDifferenceForward.
        int timeDifferenceForward = 0;

        //same meaning as the one above but this timestamp is located on the left side of the "actual_continuous", so we have:  
        // head = actual_continuous - timeDifferenceBackward.
        int timeDifferenceBackward = 0;

        //offset_continuous is the time offset between the continuous device's local absolute time and the monitor's local absolute time  
        long offset_continuous = monitor_clock_continuous - local_clock_continuous;

        //When we try to find the clock that actually corresponds to the clock_discontinuous by using the two offsets,  
        //this result (call it actual_ecg) may not correspond to any sample in continuous data set due to the sampling rate  
        long actual_continuous = monitor_clock_discontinuous - offset_continuous;

        //try to find the closest timestamp forward in the continuous data set  
        while((actual_continuous + timeDifferenceForward - local_clock_continuous) % samplingInterval != 0){
            timeDifferenceForward++;
        }

        //if timeDifferenceForward == 0, that means the "actual_continuous" we calculated before corresponds perfectly to one timestamp in continuous data  
        //we can use it as the head for this time  
        if(timeDifferenceForward == 0){
            head = actual_continuous;
            return head;
        }

        //try to find the closest timestamp backwards in the continuous data set  
        while((actual_continuous - timeDifferenceBackward - local_clock_continuous) % samplingInterval != 0){
            timeDifferenceBackward++;
        }

         //compare two time differences, choose the smaller one and calculate the head.  
        //head = (timeDifferenceForward - timeDifferenceBackward >0) ? (actual_continuous-timeDifferenceBackward) : (actual_continuous + timeDifferenceForward); 
        if(timeDifferenceForward - timeDifferenceBackward >0){
            head = actual_continuous-timeDifferenceBackward;
            console.formattedOutput("time difference", 0-timeDifferenceBackward);
        }else {
            head = actual_continuous + timeDifferenceForward;
            console.formattedOutput("time difference", timeDifferenceForward);
        }

        return head;
    }
}

/**
 * This class has different formatted output methods to display information on console.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class Console{
    /**
     * This field is to describe the detailed information of Console output.
     */
    private String description = "";

    /**
     * This method output the identifier.
     *
     * @param identifier this is the test
     */
    public void formattedOutput(String identifier) {
        System.out.println(identifier + ": ");
    }

    /**
     * This method output the identifier with value.
     *
     * @param identifier identifier to print
     * @param value corresponding value to print
     */
    public void formattedOutput(String identifier, int value) {
        System.out.println(identifier + ": " + value);
    }

    /**
     * This method output two pairs of the identifier with value.
     *
     * @param identifier1 identifier1 to print
     * @param value1 corresponding value1 to print
     * @param identifier2 identifier2 to print
     * @param value2 corresponding value2 to print
     */
    public void formattedOutput(String identifier1, long value1, String identifier2, double value2) {
        System.out.println(identifier1 + ": " + value1 + ", " + identifier2 + ": " + value2);
    }

    /**
     * This method output five pairs of the identifier with value.
     *
     * @param identifier1 identifier1 to print
     * @param value1 corresponding value1 to print
     * @param identifier2 identifier2 to print
     * @param value2 corresponding value2 to print
     * @param identifier3 identifier3 to print
     * @param value3 corresponding value3 to print
     * @param identifier4 identifier4 to print
     * @param value4 corresponding value4 to print
     * @param identifier5 identifier5 to print
     * @param value5 corresponding value5 to print
     */
    public void formattedOutput(String identifier1, long value1, String identifier2, long value2,
                                String identifier3, int value3, String identifier4, long value4,
                                String identifier5, long value5) {
        System.out.println(identifier1 + ": " + value1 + ", " + identifier2 + ": " + value2
                + ", " + identifier3 + ": " + value3 + ", " + identifier4 + ": " + value4
                + ", " + identifier5 + ": " + value5);
    }
}

/**
 * This class provides the information needed to connect to Database.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
class DataBase{
    /**
     * This field is to describe the detailed information of Database output.
     */
    private String description = "Database_test";
    /**
     * This field provides the hostname to connect the Database.
     */
    private String hostname = "titi";
    /**
     * This field provides the dbName to connect the Database.
     */
    private String dbName = "db";
    /**
     * This field provides the username to connect the Database.
     */
    private String username = "admin";
    /**
     * This field provides the password to connect the Database.
     */
    private String password = "123456";
    /**
     * This field provides the port to connect the Database.
     */
    private String port = "5555";
}