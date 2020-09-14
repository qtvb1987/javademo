package com.hello;

public class Zi extends Fu {
    int num=20;
    public  void  show(){
        System.out.println("fu---->"+super.num);
        System.out.println("zi---->"+num);
    }

    public Zi(){
        System.out.println("Zi无参构造方法");
    }
    public static void main(String[] args) {
        Zi z=new Zi();
        z.show();
        z.display();
    }
}
