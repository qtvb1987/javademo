package com.duotaidemo;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("dog eat fish");
    }

    public void play(){
        System.out.println("dog play ball");
    }
}
