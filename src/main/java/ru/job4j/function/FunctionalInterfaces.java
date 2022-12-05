package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<String> biConList = List.of("one", "two", "three", "four", "five", "six", "seven");
        BiConsumer<Integer, String> biCon = (num, str) -> map.put(num, str);
        int i = 1;
        for (String str : biConList) {
            biCon.accept(i, str);
            i++;
        }

        BiPredicate<Integer, String> biPred = (num, str) -> num % 2 == 0 || str.length() == 4;
        for (Integer k : map.keySet()) {
            System.out.println(biPred.test(k, map.get(k)));
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        System.out.println(sup.get());

        Consumer<String> con = a -> System.out.println(a);
        Function<String, String> func = a -> a.toUpperCase();
        for (String s : map.values()) {
            con.accept(s);
            System.out.println(func.apply(s));
        }
    }
}

