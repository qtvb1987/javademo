package com.finaldemo;

/**
 * final 修饰常量 不能再次赋值 ，只能赋值一次(常量)
 */
public class FinalDemo {
    int age;
    final String NAME;//只能账值一次
    final String ADDRESS;
    //可以声明的时候直接赋值  也可以用构造器 构造方法
    public FinalDemo() {
        NAME = null;
        age=20;
        ADDRESS="wuhan";
    }

    //使用有参构造方法给我们成员变量赋值 这里注意多个常量使用构造方法赋值时 使用一个构造方法完成赋值
//    public FinalDemo(String ADDRESS) {
//        ADDRESS=ADDRESS;
//    }

    public static void main(String[] args) {
        FinalDemo fd=new FinalDemo();
      //  fd.NAME="ddd";
        System.out.println(fd.NAME);
        //局部变量 用final修饰同样不能再次赋值 可以把赋值与声明分开
        //注意事项 局部变量注意一定要在使用之前赋值
        final  int a;
        a=10;
        //a=20
        System.out.println(a);

        //final 修饰的局部 引用类型 只能指向一个地址 但不影响fd2 里的方法赋值使用
        final  FinalDemo fd2=new FinalDemo();
        //fd2=new FinalDemo();
        System.out.println(fd2.age);
    }
}
