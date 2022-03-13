package com.javase.SE11_networkprogram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo03_TCPServer02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        int readLine = 0;
        byte[] buf = new byte[1024];

        while ((readLine = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLine));
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务端：Hello,client".getBytes());
        //设置结束标记
        socket.shutdownOutput();


        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
