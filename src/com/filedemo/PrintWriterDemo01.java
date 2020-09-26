package com.filedemo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo01 {
    public static void main(String[] args) {
        try {
            //创建打印流，输出目的是字节输出流
            //PrintWriter pw2=new PrintWriter(new FileOutputStream("e://printw.txt"),true);
            //创建打印流，输出目的是字符
            PrintWriter pw=new PrintWriter(new FileWriter("e://printw.txt"),true);
            pw.println(97);
            pw.println(98);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
