package com.hello;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bg=new BigInteger("1111111111111100000000");
        BigInteger bg2=new BigInteger("2");
        System.out.println(bg.add(bg2));
        System.out.println(bg.subtract(bg2));
        System.out.println(bg.multiply(bg2));

    }
}
