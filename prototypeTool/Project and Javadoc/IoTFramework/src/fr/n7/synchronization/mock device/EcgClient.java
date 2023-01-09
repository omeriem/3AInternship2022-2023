package fr.n7.synchronization.device;

import java.io.*;
import java.net.Socket;

/**
 * This class represents the ECG device.
 * This class serves as the client side for Socket connection.
 * This class connects to EcgSensor to send ECG signals.
 *
 * @author Qiyue FAN, Quanrui MU
 * @date 22/07/2021 13:40
 */
public class EcgClient {
    /**
     * This field provides the IP address to establish the Socket connection.
     */
    public static final String IP_ADDR = "localhost";
    /**
     * This field provides the port to establish the Socket connection.
     */
    public static final int PORT = 12345;

    /**
     * This method is the program entry point.
     * This method starts the Socket client.
     * This method is responsible for connecting the EcgSensor and sending data.
     *
     * @param args console parameters
     */
    public static void main(String[] args) {

        //local absolute time from ECG device's first sample
        long local_clock_ecg = 1585;

        //local absolute time from EEG device's first sample

        //sampling rate of ECG and EEG device
        int samplingRate_ecg = 1024;

        //for generating random ecg and eeg data, as key in hashmap
        long timestamp_ecg = local_clock_ecg;

        int duration_ecg = 1000;

        System.out.println("Client start...");
        Socket socket = null;
        try {
            socket = new Socket(IP_ADDR, PORT);

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

            printWriter.println("samplingRate_ecg=" + samplingRate_ecg);
            printWriter.flush();

            printWriter.println("duration_ecg=" + duration_ecg);
            printWriter.flush();

            for(int i=0; i< samplingRate_ecg*(duration_ecg/1000);i++){
                String str = timestamp_ecg + "=" + (Math.random()*2-1);
                printWriter.println(str);
                printWriter.flush();
                timestamp_ecg += 1000/samplingRate_ecg + 1;
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

