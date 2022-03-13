package com.javase.SE11_networkprogram.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class testUDPSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] data = "四大名著是哪些".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.43.83"),8888);
        datagramSocket.send(datagramPacket);

        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();
        data = datagramPacket.getData();
        System.out.println(new String(data,0, data.length));

    }
}
