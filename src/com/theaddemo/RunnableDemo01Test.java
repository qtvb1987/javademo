package com.theaddemo;

public class RunnableDemo01Test {
    public static void main(String[] args) {
        RunnableDemo01 rd=new RunnableDemo01();
        //如何资源共享的 下面两个代码传入同一个资源对象 实现了资源共享
        Thread thread=new Thread(rd);
        Thread thread2=new Thread(rd);
        thread.start();
        thread2.start();
    }
}
