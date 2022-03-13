package com.javase.SE11_networkprogram.streamutils;

import java.io.*;


public class StreamUtils {

    /*功能：
    * 将输入流转换成byte[]，即可以把文件的内容读入到byte[]
    * */
    public static byte[] streamTiByteArray(InputStream inputStream) throws IOException {
        //1.创建字节数组输出流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //2.字节数组
        byte[] buf = new byte[1024];
        int len = 0;
        //3.循环读取
        while ((len = inputStream.read(buf)) != -1){
        //4.把读取的数据，写入byteArrayOutputStream
            byteArrayOutputStream.write(buf,0,len);
        }
        //5.将byteArrayOutputStream转成字节数组
        byte[] array = byteArrayOutputStream.toByteArray();
        //6.关闭输出流
        byteArrayOutputStream.close();
        //7.返回字节数组
        return array;

    }

    /*功能：将InputStream转换成String
    * */
    public static String streamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null){
            builder.append(line + "\r\n");
        }
        return builder.toString();
    }


}
