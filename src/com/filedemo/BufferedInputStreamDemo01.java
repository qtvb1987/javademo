package com.filedemo;

import java.io.*;

public class BufferedInputStreamDemo01 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        try {
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E://BaiduNetdiskDownload/jdk-8u261-windows-x64.exe"));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E://demo/jdk.exe"));
            int len;
            byte[] bytes=new byte[1024];
            while ((len=bis.read(bytes))!=-1){
                bos.write(bytes);
            }
            long end=System.currentTimeMillis();
            System.out.println("缓冲流时间"+(end-start)+"毫秒");
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
