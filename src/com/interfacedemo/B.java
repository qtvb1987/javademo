package com.interfacedemo;

public interface B {
    public  default  void method(){
        System.out.println("B default method");
    }
}
