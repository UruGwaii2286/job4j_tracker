package ru.job4j.tracker;

import java.util.Comparator;

public class ItemAscByName implements Comparator<Item> {
    @Override
    public int compare(Item lef, Item right) {
        return lef.getName().compareTo(right.getName());
    }
}
