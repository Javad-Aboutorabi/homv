package com.company;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        int selector = 6;
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
            hob();
            zoj();
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
        System.out.println("factoriel =>  " + b);
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
    public static void zoj () {

        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + "\t");
            if (i % 5 == 0) {
                System.out.println("");
            }
        }
    }
}
