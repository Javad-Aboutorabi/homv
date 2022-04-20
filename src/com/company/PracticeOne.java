package com.company;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        int selector = 0;

        if (selector == 1) {
            mull();
        } else if (selector == 2) {
            area();
        } else if (selector == 3) {
            int a = area(12, 5);
            System.out.println("area is : " + a);
        }

        factor(5);
    }

    public static void factor(int f) {
        int b = 1;
        for (int i = f; i >= 1; i--) {
            System.out.println(i + " * " + b + " = " + (i * b));
            b = (i) * b;
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("factoriel =>  " + b);
    }

//    5*4*3*2*1

    public static void mull() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void area() {
        Scanner input = new Scanner(System.in);
        System.out.print("lotfan tool ra varde konid: ");
        double x = input.nextDouble();
        System.out.print("lotfan arz ra vared konid : ");
        double y = input.nextDouble();
        System.out.println("mashat mostatil shoma  " + x * y + "  mibashad.");
    }

    public static int area(int length, int width) {
        return length * width;
    }


}











