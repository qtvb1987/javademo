package com.idemo;

/**
 * 接口实现格式如下 implements  IDemo01,IDemo02用逗号分隔
 *
 * 注意  继承 在前 实现 在后
 */
public class ImpDemo extends Demo01 implements IDemo01,IDemo02 {
    //多个接口中都有抽象show方法，重写的时候只要重写一个
    @Override
    public void show() {
        System.out.println("show");
    }

    //接口中有多个默认方法时，实现类都可继承使用。如果默认方法有重名的，必须重写一次
//    @Override
//    public void cry() {
//
//    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    public static void main(String[] args) {
        //静态方法在不同接口中重名  相互调用不冲突 ，使用接口名调用
        IDemo02.sleep();
        IDemo01.sleep();


    }
}
