package com.idemo;

/**
 * 接口1
 */
public interface IDemo01 {

    public  void show();

    public  static   void  sleep(){
        System.out.println("idem01 sleep");
    }

    public  default  void  cry(){
        System.out.println("idem01 cry");
    }

}
