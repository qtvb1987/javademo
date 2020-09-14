package com.hello4;

/**
 * 接口
 */
public interface InterFaceDemo01 {

    //常量
    public static final int NUM1=200;
    int num2=222; //默认可以去掉public static final 修饰符

    //抽象方法
    public  abstract  void  show();

    public void  display();
    //默认方法 有方法体 default必需有
    public  default void method(){
        System.out.println("接口method");
    }
    //静态方法 有方法体
    public static  void  method2(){
        System.out.println("接口中 static");
    }

    //不可以在接口中定义成员方法
//    public   void  method3(){
//
//    }
}
