package com.filedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("E://aaa.txt");
            //写入数据
            fos.write(65);
            //关闭流
            fos.close();
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
