package com.staticdemo;

/**
 * 该方法中使用static 关键字修饰的方法称为类方法（静态方法）
 */
public class StaticMethodDemo {

    static  int age;
    static  String name;

    //静态方法
    public  static  void show(){
        //不能使用 this
        System.out.println("static show");
    }

    //普通成员方法 （非静态）
    public  void  eat(){

        show();
        System.out.println(name);
    }


    public static void main(String[] args) {

        //eat 不是静态方法 在本类中注意规则：静态方法可以直接访问本类其他静态方法或类变理 但是不能访问非静态方法

        age=90;
        System.out.println(age);

        //当前类主函数(主方法 main方法) 可以直接调用本类的其他静态方法
        show();
        //其他类访问当前类的方法 可以第一种通过对象名  第二种通过类名
        StaticMethodDemo.show();
    }
}
