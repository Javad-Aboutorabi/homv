package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("in the name of god");
        System.out.println("Hello world");
        int test = 0;
        double testDouble = 0.0;
        int a = 2;
        int b = 10;
//        test = hossein1(b, a);
//        hossein2(b, a);
//        testDouble = hossein3();
        hossein4();
        System.out.println("result : " + testDouble);


/*        while (true){
            System.out.print("please enter a number (donkey hand) : ");
            Scanner k = new Scanner(System.in);
            int v = k.nextInt();

            if (v == 10) {
                System.out.println("Siktir");
                break;
            }

            for (int i = 0; i <= 10; i++) {
                System.out.print(i * v + "\t");
            }

            System.out.println();

        }*/
///////////////////////////////////////////////////////////////
/*        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
        }*/

    }

    public static void hossein4() {
        int sum = hossein1(12, 8);
        double sum2 = (double) hossein3() + sum;
        System.out.println("ho3in " +sum2);
    }

    public static double hossein3() {
        return 3.14;
    }

    public static int hossein1(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    public static void hossein2(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println("ssssssssssssssssssss : " + sum);

    }


}
//   1               x -> y
//   2               x -> void
//   3               null -> y
//   4               null -> void