package com.javase.SE11_networkprogram.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class testUDPReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

        datagramSocket.receive(datagramPacket);

        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        System.out.println(new String(data,0,length));

        byte[] bytes = "四大名著是：".getBytes();
        datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.43.83"),9999);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
