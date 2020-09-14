package com.hello4;

/**
 * 当前类实现了 InterFaceDemo01 接口 InterFaceDemo01mpl 可被称为实现子类
 */
public class InterFaceDemo01mpl implements InterFaceDemo01 {
    //此方法在接口是抽象方法  非抽象子类必需重写
    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void display() {
        System.out.println("display");
    }
    //接口中默认方法 可以选择性去重写
//    public   void method(){
//        System.out.println("method");
//    }

    public static void main(String[] args) {
        InterFaceDemo01mpl ifc=new InterFaceDemo01mpl();
        ifc.display();
        ifc.method();
        ifc.show();
        InterFaceDemo01.method2();
        System.out.println(ifc.NUM1);
        System.out.println(ifc.num2);
        System.out.println(InterFaceDemo01.num2);
    }

}
