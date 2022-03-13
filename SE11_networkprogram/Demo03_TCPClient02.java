package com.javase.SE11_networkprogram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*字节流*/
public class Demo03_TCPClient02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端：Hello，server".getBytes());
        //设置结束标记
        socket.shutdownOutput();
        //发送完数据的时候，要有结束的标记，不然会等待,不然会阻塞


        InputStream inputStream = socket.getInputStream();

        int readLine = 0;
        byte[] buf = new byte[1024];
        //最优的读取方法，考虑将来客户端发送的数据较大
        while ((readLine = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLine));
        }

        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
