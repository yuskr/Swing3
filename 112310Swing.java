package com.test;

import java.util.Random;
import java.util.Scanner;

public class JavaDemo {

    public static void main(String[] args) {

        Random randomnum = new Random();
        Scanner scanner =new Scanner(System.in);

        while (true){
            System.out.println("请输入一个数:");
            int a = scanner.nextInt();
            if (a == 1 ){
                int x = randomnum.nextInt(100);
                int y = randomnum.nextInt(100);
                System.out.println("(" + x + "," + y + ")");
            }else {
                System.out.println("只能输入1");
            }

        }

    }

}
