package com.filedemo;

import java.io.*;

public class FileInputStreamDemo04 {
    public static void main(String[] args) {


        long start = System.currentTimeMillis();
        try {
            FileInputStream bis = new FileInputStream("E://BaiduNetdiskDownload/jdk-8u261-windows-x64.exe");
            FileOutputStream bos = new FileOutputStream("E://demo/jdk2.exe");
            int len;
            byte[] bytes=new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes);
            }
            long end = System.currentTimeMillis();
            System.out.println("流时间" + (end - start) + "毫秒");
            bis.close();
            bos.close();
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
