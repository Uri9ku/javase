package com.javase.SE11_networkprogram.test01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class testTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String readLine = bufferedReader.readLine();
            System.out.println(readLine);
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            switch (readLine){
                case "name":
                    bufferedWriter.write("我是nova");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    break;
                case "hobby":
                    bufferedWriter.write("编写java程序");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    break;
                default:
                    bufferedWriter.write("你说啥呢");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    break;
            }
        }
    }
}
