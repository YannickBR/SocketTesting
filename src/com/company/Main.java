package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Timer;

public class Main extends JFrame {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();//establishes connection

//        JFrame jPanel = new JFrame();
//        jPanel.setLayout(new FlowLayout());
//        jPanel.setSize(400, 400);
//        JLabel jLabel = new JLabel();
//        jLabel.setText("e");
//        jPanel.add(jLabel);
//        Panel panel = new Panel();
//        jPanel.add(panel);
//
//        jPanel.setVisible(true);

        while (true) {
            try {
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String str = (String) dis.readUTF();
                System.out.println(str);
//                jLabel.setText(str);
//                panel.angleInDegrees = Float.parseFloat(str) +45 ;
//
//                jPanel.repaint();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
