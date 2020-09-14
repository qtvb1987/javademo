package com.duotaidemo2;

public class NoteBook {
    //运行
    public void  run(){
        System.out.println("notebook run");
    }
    //关机
    public void  shotDown(){
        System.out.println("notebook shotDown");
    }

    public void usbRun(Usb u){
        if(u!=null){
            u.open();
            u.close();
        }
    }

    public static void main(String[] args) {
        NoteBook n=new NoteBook();
        n.run();
        KeyBoard keyBoard=new KeyBoard();
        n.usbRun(keyBoard);

        Mouse mouse=new Mouse();
        n.usbRun(mouse);

        n.shotDown();

    }

}
