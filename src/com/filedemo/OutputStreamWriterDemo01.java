package com.filedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo01 {

    public static void main(String[] args) {

        method01();
        method02();
    }
    //默认编码
    public static  void method01() {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E://out.txt"));
            osw.write("您好");
            osw.flush();
            osw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //指定编码
    public static  void method02() {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E://out2.txt"),"GBK");
            osw.write("您好");
            osw.flush();
            osw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
