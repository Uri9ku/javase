package com.javase.SE11_networkprogram;

import com.javase.SE11_networkprogram.streamutils.StreamUtils;
import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/*客户端传送服务端文件*/
public class Demo05_TCPClient04 {
    public static void main(String[] args) throws IOException {
        //1.客户端连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        //2.文件路径
        String srcFilePath = "C:\\Users\\Uriku\\Desktop\\客户端文件\\File.gif";
        //3.创建文件对象
        File file = new File(srcFilePath);
        //4.创建文件输入字节流
        FileInputStream fileInputStream = new FileInputStream(srcFilePath);
        //5.创建缓冲输入字节流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        //6.读取到字节数组，本地引用一个工具包（已包装）
        byte[] byteArray = StreamUtils.streamTiByteArray(bufferedInputStream);
        //7.通过socket获取输出流，将数据传给服务端
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(byteArray);
        //8.二进制的结束标志
        socket.shutdownOutput();
        //9.接收从服务端回复的消息（字节流）
        //  将读取的inputStream转化为字符串，本地引用一个工具包（已包装）
        InputStream inputStream = socket.getInputStream();
        System.out.println(StreamUtils.streamToString(inputStream));
        //10.关闭流
        inputStream.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.close();
    }
}
