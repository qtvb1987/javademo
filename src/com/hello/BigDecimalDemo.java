package com.hello;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bd=new BigDecimal("3333.44");
        BigDecimal bd2=new BigDecimal("111.4451111122");
        System.out.println(bd);
        System.out.println(bd.add(new BigDecimal("1.1")));

        BigDecimal br=  bd.divide(bd2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println(br);
    }
}
