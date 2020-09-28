package com.theaddemo;

/**
 * 线程书写步骤
 * 第一种：
 * 1.创建一个类继承Thread类 重写run方法 在run方法中书写线程执行任务
 * 2.创建这个类的对象
 * 3.启动线程 通过调用start方法帮助我们来启动线程
 */
public class TheadDemo01 extends Thread{

    @Override
    public void run() {
       //任务打印1-10数据
        System.out.println(getName()+"---子线程任务");//    System.out.println(+"子线程任务");//

        for (int i=1;i<=10;i++){
            //子线程
            System.out.println(i);
        }
    }
}
