package com.staticdemo;

/**
 * static 可以修饰成员变量 被称为类变量(静态变量) 被当前这个类所创建的所有对象所共享 可以
 * 通过不创建对象的方式对该类变量进行操作
 */
public class StaticMemberDemo {

    //类变量
    static  int age=20;

    public static void main(String[] args) {
//        StaticMemberDemo smd1=new StaticMemberDemo();
//        StaticMemberDemo smd2=new StaticMemberDemo();
//        smd1.age=30;
//        smd2.age=40;
//        System.out.println(smd1.age);//40
//        System.out.println(smd2.age);//40

        //不创建类对象 直接调用
        age=90;
        StaticMemberDemo.age=100;
        System.out.println(age);
        System.out.println(StaticMemberDemo.age);
    }
}
