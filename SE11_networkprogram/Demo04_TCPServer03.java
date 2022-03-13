package com.javase.SE11_networkprogram;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*字符流*/
public class Demo04_TCPServer03 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String readLine = bufferedReader.readLine();
        System.out.println(readLine);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        bufferedWriter.write("服务端：Hello,client");

        //设置结束标记
        bufferedWriter.newLine();
        //刷新
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");

    }
}
