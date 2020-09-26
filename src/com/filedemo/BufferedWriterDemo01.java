package com.filedemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出缓冲流
 */
public class BufferedWriterDemo01 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("e://filew02.txt"));
            bw.write("今天是9月26");
            //缓冲流特有方法，换行符
            bw.newLine();
            bw.write("aaabbb");
            bw.flush();
            System.out.println("写入成功");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
