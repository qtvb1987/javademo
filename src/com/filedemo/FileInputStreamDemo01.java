package com.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("E://aaa.txt");
            int i1= fis.read();
            int i2= fis.read();
            int i3= fis.read();
            int i4= fis.read();
            int i5= fis.read();
            System.out.println((char) i1);
            System.out.println((char)i2);
            System.out.println((char)i3);
            System.out.println((char)i4);
            System.out.println((char)i5);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
