package com.interfacedemo;

public interface A {
    public  default  void method(){
        System.out.println("A default method");
    }
}
