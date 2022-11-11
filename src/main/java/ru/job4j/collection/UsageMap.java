package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("ivanov@mail.ru", "Ivan Ivanov Ivanovich");
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
