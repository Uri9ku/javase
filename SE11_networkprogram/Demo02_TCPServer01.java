package com.javase.SE11_networkprogram;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*TCP编程，客服端和服务端在同一个主机
* 这个类是服务端类
* 客户端和服务端各有一个socket*/
public class Demo02_TCPServer01 {
    public static void main(String[] args) throws IOException {
        //1.在本机的9999端口监听，等待连接
        //要求本机没有其他服务在监听9999端口
        //serverSocket可以创建多个子socket，当多个客户端访问服务器的时候，就需要socketServer去创建多个socket。一个端口可以为多个客户端提供服务
        //serverSocket可以通过accept()返回多个Socket[多个客户端连接服务器的并发，就是多并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在端口9999监听，等待连接");

        //2.当没有客服端连接9999端口时，程序会阻塞，等待连接
        //当有客服端连接9999端口时，返回Socket对象，程序继续
        Socket accept = serverSocket.accept();
        System.out.println("socket的运行类型：" + accept.getClass());

        //3.通过socket.getInputStream()读取
        //如果没有接收到数据，也会阻塞
        InputStream inputStream = accept.getInputStream();

        //4.IO读取
        byte[] buf = new byte[1024];
        int readLine = 0;
        while((readLine = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLine));//根据读取到的实际长度显示内容
        }

        //5.关闭流和socket
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
