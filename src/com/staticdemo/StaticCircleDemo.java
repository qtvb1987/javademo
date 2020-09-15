package com.staticdemo;

/**
 * 静态代码块
 * 定义在成员位置，使用static修饰的代码块{}。
 * 位置：类中方法外
 * 执行：随着类的加载而执行且执行一次，优先构造方法的执行
 */
public class StaticCircleDemo {

    private  String name;
    private int age;
    //静态代码块
    static {
        System.out.println("静态代码块执行了");
    }

    public StaticCircleDemo(){
        System.out.println("无参构造函数执行了");
    }

    public static void main(String[] args) {
//       StaticCircleDemo scd=new StaticCircleDemo();
//        scd.name="4444";
//        System.out.println(scd.name);
    }
}
