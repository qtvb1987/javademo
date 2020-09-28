package com.theaddemo;

/**
 * 匿名内部类
 */
public class RunnableDemo02 {
    public static void main(String[] args) {
       Runnable r=  new Runnable(){

            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    System.out.println("输出="+i);
                }
            }
        };
        new Thread(r).start();

    }
}
