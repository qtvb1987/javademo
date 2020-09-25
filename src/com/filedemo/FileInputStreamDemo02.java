package com.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("E://aaa.txt");
            int b;
            while ((b=fis.read())!=-1){
                System.out.println((char) b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
