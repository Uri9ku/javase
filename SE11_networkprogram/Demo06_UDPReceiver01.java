package com.javase.SE11_networkprogram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo06_UDPReceiver01 {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象，准备在端口接收/发送数据,接收数据的端口8888
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        //2.创建DatagramPacket对象，用于接收数/发送据
        //  UPD协议中，每个数据包的大小最大为64K，即64 * 1024
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        //3.调用接收方法,将通过网络传输的创建DatagramSocket对象对象填充到创建DatagramPacket对象对象
        //  在8888端口等待，有数据包发送到本机的8888端口时，下面的方法会执行接收到数据到datagramPacket
        //  没有数据包的时候，端口8888就会阻塞
        System.out.println("接收端等待接收数据");
        datagramSocket.receive(datagramPacket);
        //4.拆除datagramPacket，获取数据
        int length = datagramPacket.getLength();//实际接收到数据的字节长度
        byte[] data = datagramPacket.getData();//接收到的数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //回复的数据
        data = "好的，明天见".getBytes();
        //5.DatagramPacked封装的内容数据，数据长度，主机IP，端口
        datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.43.83"),9999);
        //6.发送DatagramPacked
        datagramSocket.send(datagramPacket);
        //7.关闭流
        datagramSocket.close();
        System.out.println("接收端关闭");
    }
}
