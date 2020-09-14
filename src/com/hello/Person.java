package com.hello;

/**
 *
 */
public class Person {

    int age;
    String name;
    String sex;

    public  void  eat(){
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }

    public static void main(String[] args) {
        Person ps=new Person();
        System.out.println(ps);

        ps.name="小明";
        System.out.println(ps.name);

        ps.eat();
    }
}
