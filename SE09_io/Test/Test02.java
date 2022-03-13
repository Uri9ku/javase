package com.javase.SE09_io.Test;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Uriku\\Desktop\\test\\test01.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String readLine;
        for (int i = 1; (readLine = bufferedReader.readLine()) != null; i++) {
            System.out.println(i + " - " + readLine);
        }

        if (bufferedReader != null){
            bufferedReader.close();
        }
    }
}
