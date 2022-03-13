package com.javase.SE09_io;

import java.io.*;

public class Demo23_Properties01 {


    //读取mysql.properties文件，得到id user pwd
    //不推荐这个方法，数据很多就很麻烦
    public static void main(String[] args) throws IOException {
        String filePath = "src/com/javase/io/mysql.properties";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String line = null;

        //这个方法是遍历出来的，如果指定要某的项的值的话就得弄个判断split数组的下标，很麻烦
        while ((line = bufferedReader.readLine()) != null){
            String[] split  = line.split("=");

            System.out.println(split[0] + ":" + split[1]);
        }

        bufferedReader.close();

    }
}
