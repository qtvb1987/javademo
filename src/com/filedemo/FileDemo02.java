package com.filedemo;

import java.io.File;

public class FileDemo02 {
    public static void main(String[] args) {
        //对文件
        File file=new File("E://aaa/bbb.txt");
        System.out.println("文件绝对路径:"+file.getAbsolutePath());
        System.out.println("文件构造路径:"+file.getPath());
        System.out.println("文件名称:"+file.getName());
        System.out.println("文件长度："+file.length());
        System.out.println("文件父路径："+file.getParentFile());

        //对文件夹
        File file2=new File("E://bbb");
        System.out.println("文件绝对路径:"+file2.getAbsolutePath());
        System.out.println("文件构造路径:"+file2.getPath());
        System.out.println("目录名称:"+file2.getName());
        System.out.println("文件长度："+file2.length());
        System.out.println("文件父路径："+file2.getParentFile());


    }
}
