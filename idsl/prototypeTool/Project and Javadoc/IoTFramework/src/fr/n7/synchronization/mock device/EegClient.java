package fr.n7.synchronization.device;

import java.io.*;
import java.net.Socket;

/**
 * This class represents the EEG device.
 * This class serves as the client side for Socket connection.
 * This class connects to EegSensor to send EEG signals.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
public class EegClient {
    /**
     * This field provides the IP address to establish the Socket connection.
     */
    public static final String IP_ADDR = "localhost";
    /**
     * This field provides the port to establish the Socket connection.
     */
    public static final int PORT = 12346;

    /**
     * This method is the program entry point.
     * This method starts the Socket client.
     * This method is responsible for connecting the EegSensor and sending data.
     *
     * @param args console parameters
     */
    public static void main(String[] args) {

        //local absolute time from EEG device's first sample
        long local_clock_eeg = 567;

        //sampling rate of ECG and EEG device
        int samplingRate_eeg = 256;

        //for generating random ecg and eeg data, as key in hashmap
        long timestamp_eeg = local_clock_eeg;

        int duration_eeg = 1000;

        System.out.println("Client start...");
        Socket socket = null;
        try {
            socket = new Socket(IP_ADDR, PORT);

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

            printWriter.println("samplingRate_eeg=" + samplingRate_eeg);
            printWriter.flush();

            printWriter.println("duration_eeg=" + duration_eeg);
            printWriter.flush();

            for(int i=0; i< samplingRate_eeg*5*(duration_eeg/1000);i++){
                String str = timestamp_eeg + "=" + (Math.random()*2-1);
                printWriter.println(str);
                printWriter.flush();
                timestamp_eeg += 1000/samplingRate_eeg +1;
            }

            String str = "OK";
            printWriter.println(str);
            printWriter.flush();

        } catch (Exception e) {
            System.out.println("Client exception:" + e.getMessage());
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    socket = null;
                    System.out.println("Client finally exception:" + e.getMessage());
                }
            }
        }

    }
}

