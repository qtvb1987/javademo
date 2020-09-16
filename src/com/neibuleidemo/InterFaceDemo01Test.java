package com.neibuleidemo;

public class InterFaceDemo01Test {
    public static void main(String[] args) {
        new InterFaceDemo01(){

            int a=33;
            public  void kk(){
                System.out.println("kk");
            }
            @Override
            public void show() {
                System.out.println("i am show method");
            }
        }.show();

       AbstractClassDemo atd=  new AbstractClassDemo(){

            @Override
            public void test() {
                System.out.println("abstract test method");
            }
        };

        atd.test();

    }
}
