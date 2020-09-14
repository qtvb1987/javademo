package com.duotaidemo2;

public class Mouse implements  Usb{
    @Override
    public void open() {
        System.out.println("Mouse open");
    }

    @Override
    public void close() {
        System.out.println("Mouse close");
    }
}
