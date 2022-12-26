package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterNegativeNumbers {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(-1, -6, -7, 9, 2, 7);
            List<Integer> positive = numbers.stream().filter(x -> x > 0).collect(toList());
            positive.forEach(System.out::println);
        }
    }
