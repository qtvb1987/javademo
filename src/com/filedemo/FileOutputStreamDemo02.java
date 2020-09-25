package com.filedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("E://aaa.txt");
            //getBytes() 字符串中的方法 把字符串转换成字节数组
            String str="11abbb11";
            byte[] b1=str.getBytes();
            fos.write(b1);
            fos.close();
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
