package com.filedemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流 注意使用的调用flush方法 从缓存区数据直接写入内存中
 */
public class FileWriterDemo01 {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("e://filew.txt");
            fw.write("您好");
            char[] c1={'a','b'};
            fw.write(c1);
            fw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
