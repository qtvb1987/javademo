package com.hello;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r=new Random();
        int num =r.nextInt(900);
        System.out.println(num);
    }
}
