package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
     public void drive() {
    }

    @Override
    public void passengers(int number) {

    }

    @Override
    public double fuel(double fuel) {
        double price = fuel * 150;
        return price;
    }
}

