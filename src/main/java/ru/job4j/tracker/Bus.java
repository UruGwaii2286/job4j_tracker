package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
     public void drive() {
        return;
    }

    @Override
    public int passengers(int number) {
        return number;
    }

    @Override
    public double fuel(double fuel) {
        double price = fuel * 150;
        return price;
    }
}

