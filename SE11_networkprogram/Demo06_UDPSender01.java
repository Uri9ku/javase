package com.javase.SE11_networkprogram;

import java.io.IOException;
import java.net.*;

/*UPD协议传输数据
* 字符流*/
public class Demo06_UDPSender01 {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象，准备在端口接收/发送数据，在9999端口接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2.创建DatagramPacket对象，用于接收数/发送据
        byte[] data = "Hello,明天吃火锅".getBytes();
        //  DatagramPacked封装的内容数据，数据长度，主机IP，端口
        //  InetAddress.getLocalHost() 本地IP
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length,InetAddress.getByName("192.168.43.83"),8888);
        //3.发送DatagramPacked
        datagramSocket.send(datagramPacket);
        //4.获取数据
        byte[] buf = new byte[1024];
        datagramPacket = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(datagramPacket);
        int length = datagramPacket.getLength();//长度
        data = datagramPacket.getData(); //数据2
        String s = new String(data, 0, length);
        System.out.println(s);
        //4.关闭流
        datagramSocket.close();
        System.out.println("发送端关闭");
    }
}
