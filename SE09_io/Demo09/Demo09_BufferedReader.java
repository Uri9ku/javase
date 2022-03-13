package com.javase.SE09_io.Demo09;

public class Demo09_BufferedReader extends Demo09_PackagStream {
    /*做成包装流*/

    private Demo09_PackagStream demo09_packagStream; //属性是Demo09——PackStream类型

    public Demo09_BufferedReader(Demo09_PackagStream demo09_packagStream) {
        this.demo09_packagStream = demo09_packagStream;
    }
}
