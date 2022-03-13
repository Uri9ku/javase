package com.javase.SE11_networkprogram;

import com.javase.SE11_networkprogram.streamutils.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo07_TCPServer05 {
    public static void main(String[] args) throws IOException {


        //1.监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.等待客户端连接
        Socket socket = serverSocket.accept();

        //3.读取客户端发送要下载的文件
        String filePath = "C:\\Users\\Uriku\\Desktop\\服务端接收\\11.gif";
        File file = new File(filePath);
        BufferedInputStream bufferedInputStream = new BufferedInputStream((new FileInputStream(file)));

        byte[] byteArray = StreamUtils.streamTiByteArray(bufferedInputStream);
        //4.
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(byteArray);
        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.shutdownOutput();



    }
}
