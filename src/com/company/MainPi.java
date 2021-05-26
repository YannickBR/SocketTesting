package com.company;

import rpi.sensehat.api.SenseHat;
import rpi.sensehat.api.dto.Color;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Timer;

public class MainPi {
    static Color starColor = Color.of(252, 215, 5);
    static SenseHat senseHat = new SenseHat();
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ssReceiver = new ServerSocket(5555);
        System.out.println("Awaiting connection...");
        Socket receiverSocket = ssReceiver.accept();
        System.out.println("Connected!");
        while (true) {
                        DataInputStream dis = new DataInputStream(receiverSocket.getInputStream());
                        if (dis.available() > 0) {
                            String str = dis.readUTF();
                            System.out.println(str);
                            if (str.equals("star 1")) {
                                star(1);
                                System.out.println("done");
                            }
                            if (str.equals("star 2")) {
                                star(2);
                            }
                            if (str.equals("star 3")) {
                                star(3);
                            }
                        }
                    }
             }

    public static void star(int ammunt) {
        if (ammunt == 1) {
            senseHat.ledMatrix.clear();
            senseHat.ledMatrix.setPixel(1, 3, starColor);
            senseHat.ledMatrix.setPixel(0, 4, starColor);
            senseHat.ledMatrix.setPixel(2, 4, starColor);
            senseHat.ledMatrix.setPixel(1, 5, starColor);
            senseHat.ledMatrix.setPixel(1, 4, starColor);
        }

        if (ammunt == 2) {
            senseHat.ledMatrix.clear();
            senseHat.ledMatrix.setPixel(1, 3, starColor);
            senseHat.ledMatrix.setPixel(0, 4, starColor);
            senseHat.ledMatrix.setPixel(2, 4, starColor);
            senseHat.ledMatrix.setPixel(1, 5, starColor);
            senseHat.ledMatrix.setPixel(1,  4, starColor);

            senseHat.ledMatrix.setPixel(6,4, starColor);
            senseHat.ledMatrix.setPixel(5,5, starColor);
            senseHat.ledMatrix.setPixel(6,5, starColor);
            senseHat.ledMatrix.setPixel(7,5, starColor);
            senseHat.ledMatrix.setPixel(6, 6,starColor);
        }

        if (ammunt == 3) {
            senseHat.ledMatrix.clear();
            senseHat.ledMatrix.setPixel(1, 3, starColor);
            senseHat.ledMatrix.setPixel(0, 4, starColor);
            senseHat.ledMatrix.setPixel(2, 4, starColor);
            senseHat.ledMatrix.setPixel(1, 5, starColor);
            senseHat.ledMatrix.setPixel(1, 4, starColor);

            senseHat.ledMatrix.setPixel(6,4, starColor);
            senseHat.ledMatrix.setPixel(5,5, starColor);
            senseHat.ledMatrix.setPixel(6,5, starColor);
            senseHat.ledMatrix.setPixel(7,5, starColor);
            senseHat.ledMatrix.setPixel(6, 6, starColor);

            senseHat.ledMatrix.setPixel(4,1, starColor);
            senseHat.ledMatrix.setPixel(3,2, starColor);
            senseHat.ledMatrix.setPixel(4,2, starColor);
            senseHat.ledMatrix.setPixel(5,2, starColor);
            senseHat.ledMatrix.setPixel(4, 3, starColor);
        }

    }

}
