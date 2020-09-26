package com.filedemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入缓冲流
 */
public class BufferedReaderDemo01 {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("e://filew02.txt"));
            String str;
            //read 方法读取参照字符流 readline是缓冲流特有方法
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
