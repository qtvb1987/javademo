package com.duotaidemo2;

public class KeyBoard implements Usb {
    @Override
    public void open() {
        System.out.println("KeyBoard open");
    }

    @Override
    public void close() {

        System.out.println("KeyBoard close");
    }
}
