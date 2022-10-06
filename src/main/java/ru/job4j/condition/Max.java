package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int a) {
        return max(left, max(right, a));
    }

    public static int max(int left, int right, int a, int b) {
        return max(max(left, right), max(a, b));
    }
}
