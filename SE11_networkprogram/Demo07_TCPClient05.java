package com.javase.SE11_networkprogram;


import com.javase.SE11_networkprogram.streamutils.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端下载服务端的文件
public class Demo07_TCPClient05 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] byteArray = StreamUtils.streamTiByteArray(bufferedInputStream);


        String filePath = "C:\\Users\\Uriku\\Desktop\\客户端文件\\11.gif";
        File file = new File(filePath);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bufferedOutputStream.write(byteArray);

        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.shutdownOutput();

    }
}
