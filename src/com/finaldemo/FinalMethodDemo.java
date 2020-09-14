package com.finaldemo;

/**
 * final方法 不能被重写
 */
public class FinalMethodDemo {
    public final void method(){

    }

}

class Demo extends  FinalMethodDemo{
    //不能重写父类 final的方法
//    public void method(){
//
//    }
}
