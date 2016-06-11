package com.felix.jse;

import java.net.ServerSocket;

public class SampleServer {

    public static void main(String[] args) throws Exception {
        System.out.println("The capitalization server is running.");
        int clientNumber = 0;
        ServerSocket listener = new ServerSocket(9898);
        try {
            while (true) {
                new SampleService(listener.accept(), clientNumber++).start();
            }
        } finally {
            listener.close();
        }
    }
}