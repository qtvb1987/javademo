package com.interfacedemo;

/**
 * 接口与接口之前继承关系  多继承用,号分隔  默认方法在继承重名时 子接口重写一个默认方法
 */
public interface C extends A,B {
    public  default  void method(){
        System.out.println("C default method");
    }

    public static void main(String[] args) {

    }
}
