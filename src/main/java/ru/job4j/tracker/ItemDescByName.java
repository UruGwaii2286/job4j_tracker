package ru.job4j.tracker;

import java.util.Comparator;

public class ItemDescByName implements Comparator<Item> {
    @Override
    public int compare(Item lef, Item right) {
        return  right.getName().compareTo(lef.getName());
    }
}
