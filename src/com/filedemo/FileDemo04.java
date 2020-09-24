package com.filedemo;

import java.io.File;

/**
 * file 创建文件夹、目录
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File file=new File("E://demo");
        //些方法可以创建单目录文件夹
        System.out.println(file.mkdir());
        File file2=new File("E://demo01/aaa/bbb");
        //多目录
        System.out.println(file2.mkdirs());
    }
}
