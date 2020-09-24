package com.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * 绝对路径 ： 在硬盘中真实的路径 精确到盘符的
 * 相对路径 ： 一般对于项目目录结构路径
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file);
        //相对路径
        System.out.println(file.getPath());
        //绝对路径
        System.out.println(file.getAbsolutePath());
    }
}
