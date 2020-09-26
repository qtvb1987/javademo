package com.filedemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 练习
 */
public class TestDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        try {
            BufferedReader br=new BufferedReader(new FileReader("e://filesort.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("e://filesort02.txt"));
            String str;
            while ((str=br.readLine())!=null){
                list.add(str);
            }
            //排序
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    //o1-o2升序
                    //o2-o1降序
                    return o1.charAt(0)-o2.charAt(0);
                }
            });
            System.out.println(list);
            for (String s:list){
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
