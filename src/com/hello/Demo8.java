package com.hello;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {

        //键盘录入一个数 判断奇数 还是偶数

        Scanner s1=new Scanner(System.in);
        int num= s1.nextInt();
        if(num%2==0){
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }
    }
}
