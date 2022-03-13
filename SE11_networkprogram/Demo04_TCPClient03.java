package com.javase.SE11_networkprogram;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo04_TCPClient03 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        OutputStream outputStream = socket.getOutputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        bufferedWriter.write("客户端：Hello，server");

        //设置结束标记,换行符，用字符流一定要用这个
        bufferedWriter.newLine();
        //发送完数据的时候，要有结束的标记，不然会等待,不然会阻塞

        //如果使用字符流，一定要刷新，否则不会写入
        bufferedWriter.flush();


        InputStream inputStream = socket.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


        String readLine = bufferedReader.readLine();
        System.out.println(readLine);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出");
    }

}
