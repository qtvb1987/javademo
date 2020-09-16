package com.twoclassdemo;

/**
 * 外部类
 */
public class Outer {
    private  int age;
    String name;
    public  void  show(){
        System.out.println("外部类的show方法");
    }
    //内部类:直接访问外部类的成员 包括私有的
    class  Inner{
        int a;
        public  void display(){
            System.out.println(age);
            System.out.println(name);
            show();
        }
        //成员内部类不能定义静态方法 也不能有主函数
//        public static void main(String[] args) {
//
//        }
    }

    public static void main(String[] args) {
        Outer ot=new Outer();
        ot.show();

        //创建内部类对象
        //外部类.内部类 对象名 =new 外部类().new 内部类
        Outer.Inner oi=new Outer().new Inner();
        //调用内部类中方法和变量
        oi.a=30;
        System.out.println(oi.a);
        oi.display();

    }
}
