package com.twoclassdemo;

public class TestPerson {
    public static void main(String[] args) {
        Person p=new Person();
        //匿名对象 特点 此对象不能被再次调用
        System.out.println(new Person());
        Person.Heart ph=p.new Heart(); //new Person().new Heart();
        ph.jump();
        p.setLive(false);
        ph.jump();
    }
}
