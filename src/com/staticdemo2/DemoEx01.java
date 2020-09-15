package com.staticdemo2;

import com.staticdemo.Demo01;

public class DemoEx01  extends Demo01 {
    public  void show()
    {
        //不同包 子类也可以访问 public protected
        System.out.println(age);
        System.out.println(name);
    }
}
