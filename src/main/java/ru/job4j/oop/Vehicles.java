package ru.job4j.oop;

public class Vehicles {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle buss = new Buss();

        Vehicle[] vehicles = new Vehicle[]{plane, train, buss};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
