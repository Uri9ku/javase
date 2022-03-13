package com.javase.SE09_io.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "C:\\Users\\Uriku\\Desktop\\test";
        String filePath = directoryPath + "\\test01.txt";
        File file = new File(directoryPath);

        if (!file.exists()) {
            file.mkdirs();
        }

        file = new File(filePath);
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(filePath);

        String str = "Helllo,world";
        fileWriter.write(str );

        fileWriter.close();
    }
}
