package com.filedemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {

    public static void main(String[] args) {
        try {
            //FileOutputStream 第二个参数true 是追加数据
            FileOutputStream fos=new FileOutputStream("E://ccc.txt",true);
            //getBytes() 字符串中的方法 把字符串转换成字节数组
            String str="11abbb11";
            byte[] b1=str.getBytes();
            //从索引3开始 写入2个字节
            fos.write(b1,3,2);
            fos.close();
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
