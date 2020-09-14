package com.finaldemo;

/**
 * final 修饰常量 不能再次赋值 ，只能赋值一次(常量)
 */
public class FinalDemo {
    int age;
    final String NAME;//只能账值一次

    //可以声明的时候直接赋值  也可以用构造器 构造方法
    public FinalDemo() {
        NAME = null;
        age=20;
    }

    public static void main(String[] args) {
        FinalDemo fd=new FinalDemo();
      //  fd.NAME="ddd";

        //局部变量 用final修饰同样不能再次赋值 可以把赋值与声明分开
        //注意事项 局部变量注意一定要在使用之前赋值
        final  int a;
        a=10;
        //a=20
        System.out.println(a);

        //final 修饰的局部 引用类型 只能指向一个地址 但不影响fd2 里的方法赋值使用
        final  FinalDemo fd2=new FinalDemo();
        //fd2=new FinalDemo();
    }
}
