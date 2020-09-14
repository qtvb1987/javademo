package com.hello;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 创建 各种数据类型的变量
 */
public class VariableDemo {
    public static void main(String[] args) {



        //byte类型的变量
        byte by = 100;
        System.out.println(by);

        //short 短整型
        short sh = 12345;
        System.out.println(sh);

        //int 类型
        int in = 111;
        System.out.println(in);
        in = 1234;
        System.out.println(in);

        //long 类型的变量 ,在数值后面加字幕l,L
        long lo=123456789012L;
        System.out.println(lo);

        //单精度浮点数 float,在数值后面加字母f ,F
        float fl=3.14f;
        System.out.println(fl);

        //双精度浮点数
        double dou=5.555;
        System.out.println(dou);

        //char 字符类型 变量
        char ch='A';
        ch='B';
        System.out.println(ch);

        //boolean 布尔类型 变最
        boolean bo=true;
        System.out.println(bo);

    }
}
