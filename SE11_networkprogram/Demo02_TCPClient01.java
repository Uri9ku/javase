package com.javase.SE11_networkprogram;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*TCP编程，客服端和服务端在同一个主机
 * 这个类是客户端类
 * 客户端和服务端各有一个socket*/
public class Demo02_TCPClient01 {
    public static void main(String[] args) throws IOException {
        //1.连接服务器（IP，端口）
        //连接服务端的9999端口，连接成功则返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端的运行类型：" + socket.getClass());

        //2.连接上去后，生成Socket，通过socket.getOutputStream()
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，写入数据到数据通道
        outputStream.write("Hello,server".getBytes());

        //4.关闭流对象和socket，必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
