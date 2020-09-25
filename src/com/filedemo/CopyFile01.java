package com.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile01 {
    public static void main(String[] args) {
        //复制 e://aaa.txt这个文件已有  复制到E://demo01/aaa/bbb
        //当前案例复制一个文本文档
        try {
            FileInputStream fis=new FileInputStream("E://aaa.txt");
            FileOutputStream fos=new FileOutputStream("E://demo01/aaa/bbb/aaa.txt");
            int len;
            byte[] bytes=new byte[1024];
            while ((len=fis.read(bytes))!=-1){
                String str=new String(bytes,0,len);
                System.out.println("读取"+str);
                fos.write(str.getBytes());
            }
            System.out.println("copy成功");
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
