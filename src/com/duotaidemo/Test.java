package com.duotaidemo;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //多态触发前提条件 1.继承或实现 关系类中 2。方法重写 注重重写 3.父类类型指向子类对象

        //向上转型
        Animal a1=new Dog();
        //调用的方法  子父类共有方法 父类中有的方法
        a1.eat();
        //如果子类重写输入子类中的方法内容 否则输出父类中的方法内容
        a1.show();
        //向上转型
        Animal a2=new Cat();
        a2.eat();

        //向下转型
        Animal a3=new Dog();
        Dog d1=(Dog) a3;
        d1.eat();
        d1.play();

        Animal a4 =new Cat();
        Cat c1=(Cat) a4;
        c1.play();

        //instanceof 比对 类型一致 用它可以做判断 减少 转换异常
        System.out.println(a4 instanceof Dog);

    }
}
