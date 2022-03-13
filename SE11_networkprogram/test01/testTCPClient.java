package com.javase.SE11_networkprogram.test01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class testTCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        System.out.print("请输入你的问题：");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String msg = scanner.nextLine();
            bufferedWriter.write(msg);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String readLine = bufferedReader.readLine();
            System.out.println(readLine);
        }

    }
}
