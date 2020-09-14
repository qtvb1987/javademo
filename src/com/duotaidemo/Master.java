package com.duotaidemo;

/**
 * 主人类 非多态形式去书写这个主人喂养宠物
 */
public class Master {

    public  void feedDog(Dog d){
        d.eat();

    }

    public  void  feedCat(Cat c){
        c.eat();

    }

    public static void main(String[] args) {
        Master m=new Master();
        Cat xiaoBai=new Cat();

        m.feedCat(xiaoBai);
    }
}
