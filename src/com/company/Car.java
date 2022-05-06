package com.company;

public class Car {
    //    Field
    private String brand;
    private String color;
    private int year;
    private boolean isSedan;

    public Car(String brand, String color, int year, boolean isSedan) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.isSedan = isSedan;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSedan() {
        return isSedan;
    }


}
