package com.theaddemo;

public class TreadDemo01Test {
    public static void main(String[] args) {
        //创建线程子类对象
        TheadDemo01 td=new TheadDemo01();
        td.setName("子线程一");
        //启动线程
        td.start();

        TheadDemo01 td2=new TheadDemo01();
        td2.setName("子线程二");
        td2.start();

        //主函数中内容叫主线程
        //任务打印1-20数字
        System.out.println("主线程任务");
        for (int i=1;i<=20;i++){
            System.out.println(i);
        }
    }
}
