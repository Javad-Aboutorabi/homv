package com.company;

import java.util.ArrayList;

public class PracticeThree {


    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car lamborghini = new Car("Lamborghini", "Yellow", 2022, false);
        Car benz = new Car("Benz", "Black", 2022, true);
        Car bmw = new Car("BMW", "Red", 2022, false);

        cars.add(benz);
        cars.add(bmw);
        cars.add(lamborghini);
        System.out.println("brand: " + "\t\tsedan : " + "\t\t Year : " + "\t\tcolor : ");
        for (int i = 0;i<cars.size();i++ ) {
            System.out.println(cars.get(i).getBrand() + "\t\t  " + cars.get(i).isSedan() + "\t\t     " + cars.get(i).getYear() + "\t\t    " + cars.get(i).getColor());
        }


//        System.out.println(benz.getBrand() + "\t\t  " + benz.isSedan() + "\t\t     " + benz.getYear() + "\t\t    " + benz.getColor());
//        System.out.println(lamborghini.getBrand() + "\t  " + lamborghini.isSedan() + "\t\t     " + lamborghini.getYear() + "\t\t    " + lamborghini.getColor());
//        System.out.println(bmw.getBrand() + "\t\t\t  " + bmw.isSedan() + "\t\t     " + bmw.getYear() + "\t\t    " + bmw.getColor());

    }
}
