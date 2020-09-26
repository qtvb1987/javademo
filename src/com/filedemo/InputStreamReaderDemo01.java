package com.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo01 {
    public static void main(String[] args) {

        try {
            method01();
            method02();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method01() throws IOException {
            InputStreamReader isr=new InputStreamReader(new FileInputStream("E://aaa.txt"));
            int len=0;
            while ((len=isr.read())!=-1){
                System.out.println((char)len);
            }
           isr.close();

    }

    public static void method02() throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("E://aaa.txt"),"GBK");
        int len=0;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();

    }
}
