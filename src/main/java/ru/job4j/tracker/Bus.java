package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
     public void drive() {
        System.out.println();
    }

    @Override
    public void passengers(int number) {
        System.out.println(number);
    }

    @Override
    public double fuel(double fuel) {
        double price = fuel * 150;
        return price;
    }
}

