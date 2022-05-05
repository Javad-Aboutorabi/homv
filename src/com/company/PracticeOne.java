package com.company;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        int selector = 8;
        if (selector == 1) {
            mull();
        } else if (selector == 2) {
            area();
        } else if (selector == 3) {
            int a = area(12, 5);
            System.out.println("area is : " + a);

        } else if (selector == 4) {
            factor(5);
        } else if (selector == 5) {
            Scanner scanner = new Scanner(System.in);
            int UserInput = scanner.nextInt();
            String s = bakhshi(UserInput);
            System.out.println("result : " + s);
        } else if (selector == 6) {
            // list();
            // hob();
            //zoj(100);
            //sum(4);
            //int pow = tavan(6);
            //System.out.println("pow is = " + pow);


           // System.out.println(matn());
           // amal(10, 10);
            /*
            tamrine Yaroo
            int sum = sum(100);
            System.out.println("sum = " + sum);
            */

        } else if (selector == 7) {
            aray();
        }
    }

    public static void list() {
        String[] list = {"Dr javad",
                "prof Hossein",
                "Reza sag",
                "Sag mammad",
                "reza Koone sarbaz",
                "Kiyounian",
                "farhad kiri",
                "mamad HakimDi",
                "rimin kirjooon",
                "liskt"};

        for (int i = 9; i >= 0; i--) {
            System.out.println(list[i]);

        }
        for (int j = 0; j <= 9; j++) {
            System.out.println(list[j]);
        }
    }


    public static String bakhshi(int num) {
        String answer = "";
        if (num % 2 == 0)
            answer = answer + " , " + "two";
        if (num % 3 == 0)
            answer = answer + " , " + "three";
        if (num % 5 == 0)
            answer = answer + " , " + "five";
        if (num % 7 == 0)
            answer = answer + " , " + "seven";
        if (num % 11 == 0)
            answer = answer + " , " + "eleven";
        return answer;

    }

    public static void factor(int f) {
        int b = 1;
        for (int i = f; i >= 1; i--) {
            System.out.println(i + " * " + b + " = " + (i * b));
            b = (i) * b;
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("factories =>  " + b);
    }

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

    public static void hob() {
        int i;
        for (i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                System.out.println("hob");
            } else {
                System.out.print(i + "\t");

            }
        }

    }

    public static void sum(int had) {
        int sum = 0;
        for (int i = had; i >= 0; i--) {
            sum = sum + i;
        }
        System.out.println("sum : " + sum);
    }


    public static void zoj(int had) {
        for (int i = 0; i <= had; i += 2) {
            System.out.print(i + "\t");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    public static double pi() {
        return 3.14;
    }

    public static void aray() {
        System.out.println("aray");
        int[] a = {3, 39, 0, 54, 78, 88, 100};
        for (int i = 0; i < a.length; i++) {
            System.out.println("element : " + a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 10;
        }
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.println("element : " + a[i]);
        }

    }

    public static int tavan(int a) {
        return (int) Math.pow(a, 2.0);
    }

    public static String matn() {
        return "I am programmer";
    }

    public static void amal(int a, int b) {
        System.out.println("zarb :" +(a * b) + "\n" + "jam :" + (a + b )+ "\n" + "taghsim :" + (a / b) + "\n" + "menha :" + (a - b));
    }
}






