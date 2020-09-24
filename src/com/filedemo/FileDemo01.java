package com.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) {
        //第一步 创建file对象 第一种file对象创建
        File file=new File("E:\\aaa.txt");
        System.out.println(file);

        try {
            //调用此方法 帮助我们在指定路径上去创建一个文件 需要try/catch处理异常
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //第二种 子父路径
        File file1=new File("E:\\bbb","ccc.txt");
        System.out.println(file1);
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //第三种
        File file2=new File("E:\\ddd");
        File file3=new File(file2,"eee.txt");
        System.out.println(file3);
    }
}
