package com.filedemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流  （纯文本格式 用字符流）
 */
public class FileReaderDemo01 {
    public static void main(String[] args) {

        method02();
    }
    public static void method01(){
        try {
            FileReader fr=new FileReader("e://out.txt");
            int len;
            while((len=fr.read())!=-1){
                System.out.println((char)len);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void method02(){
        try {
            FileReader fr=new FileReader("e://out.txt");
            int len;
            char[] c1=new char[1024];
            while((len=fr.read(c1))!=-1){
                System.out.println(new String(c1));
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
