package com.hello2;

public class NewPhone extends Phone {

    //来电显示
    public  void show()
    {
        super.show();
        //System.out.println("来电显示号码");
        System.out.println("显示姓名");

    }

    public static void main(String[] args) {
        NewPhone np=new NewPhone();
        np.show();
        np.call();
        np.sendMsg();
    }
}
