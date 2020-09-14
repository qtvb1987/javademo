package com.hello;

import java.util.Random;
import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Random r=new Random();
        int number=r.nextInt(100)+1;
        while (true){
            Scanner s=new Scanner(System.in);
            System.out.println("请输入要猜的数字:");
            int guessNumber=s.nextInt();
            if(guessNumber>number){
                System.out.println("你猜的数字"+guessNumber+"过大");
            }
            else  if (guessNumber<number){
                System.out.println("你猜的数字"+guessNumber+"过小");
            }else {
                System.out.println("恭喜猜中了");
                break;
            }

        }

    }
}
