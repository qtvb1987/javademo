package com.duotaidemo;

/**
 * 升级版 结合多态
 */
public class MasterBuffer {
    //第一个形式 父类类型当做方法参数列表

    public  void feed(Animal a){
        a.eat();
    }

    public static void main(String[] args) {
        MasterBuffer Zhangsan=new MasterBuffer();
        Cat c=new Cat();
        Zhangsan.feed(c);


    }
}
