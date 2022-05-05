package com.company;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTwo {
    public static void main(String[] args) {
//        System.out.println(team(false)+" : "+team2(false));
//        tamrin5(123);
//        rezaLisi();
        rezaSik();
    }

    public static void rezaSik() {
        ArrayList<Integer> list = new ArrayList();
        Random r = new Random();
        for (int i = 0; i <= 10; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println(list);
        int j = 0;
        for (int i = 0; i <list.size(); i++){
            if(list.get(i) > j ){
                System.out.println(list);
            }
        }






    }


/*    public static void rezaLisi() {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            list.add(i * 10);
        }
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);

    }*/


    public static void tamrin5(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    public static String team(Boolean b) {
        if (b) {
            return "Barca";
        } else {
            return "RealMadrid";
        }
    }

    public static String team2(boolean b) {
        if (b) {
            return "Perspolise";
        } else {
            return "kiste";
        }
    }

}
