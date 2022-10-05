package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int rsl = sum(10);
        System.out.println(rsl);
        Calculator calculator = new Calculator();
        int rsl1 = calculator.multiply(5);
        System.out.println(rsl1);
        int result2 = minus(15);
        System.out.println(result2);
        Calculator calculator2 = new Calculator();
        int rsl3 = calculator2.divide(50);
        System.out.println(rsl3);
        Calculator calculator3 = new Calculator();
        int rsl4 = calculator3.sumAllOperation(15);
        System.out.println(rsl4);
    }
}
