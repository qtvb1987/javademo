package com.hello3;

/**
 * 抽象类
 * 不能实例化
 * 可以被继承
 * 即可以申明抽象方法 ; 又可以书写成员方法
 * 在子类中必需重写父类抽象方法（除非子类也是抽象类）
 */
public abstract class Father {
    public static void main(String[] args) {
        //Father f1=new Father() ;
    }

    //抽象方法  特点：没有方法体 存在抽象类中
    //在子类中必需重写父类抽象方法
    public abstract  void show();

    //成员方法
    public void display(){
        System.out.println("ddd");
    }
}

//class Son extends Father{
//
//}
