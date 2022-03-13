package com.javase.SE11_networkprogram;

import com.javase.SE11_networkprogram.streamutils.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo05_TCPServer04 {
    public static void main(String[] args) throws IOException {
        //1.服务端监听端口
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.等待客户端连接
        System.out.println("服务端在端口8888监听");
        Socket socket = serverSocket.accept();
        //3.通过socket得到输入流，读取客户端数据(获取的是字节数组)
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        //4.读取到字节数组，本地引用一个工具包（已包装）
        byte[] byteArray = StreamUtils.streamTiByteArray(bufferedInputStream);
        //5.将得到的字节数组保存到指定路径
        //6.文件路径
        String destFilePath = "C:\\Users\\Uriku\\Desktop\\服务端接收\\11.gif";
        //7.创建缓冲字节输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
        //8.文件写入
        bufferedOutputStream.write(byteArray);
        //9.向客户端回复收到图片（字符）
        //  通过socket获取输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("服务端成功收取");
        //10.结束标志
        bufferedWriter.newLine();
        bufferedWriter.flush();
        //11.关闭流
        bufferedWriter.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        serverSocket.close();
        socket.close();
    }
}
