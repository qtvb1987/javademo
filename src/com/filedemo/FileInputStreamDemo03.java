package com.filedemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo03 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("E://aaa.txt");
            int b;
            byte[] buffer=new byte[3];

            //read byte[] 一次读多个字节存储容器就是声明这个数组
            while ((b=fis.read(buffer))!=-1){
                System.out.println(new String(buffer,0,b));
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
