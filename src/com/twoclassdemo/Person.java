package com.twoclassdemo;

public class Person {
    private  boolean live=true;

    //内部类 行为
    class Heart{
        public  void  jump(){
            if(live){
                System.out.println("live");
            }else {
                System.out.println("not life");
            }
        }
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
