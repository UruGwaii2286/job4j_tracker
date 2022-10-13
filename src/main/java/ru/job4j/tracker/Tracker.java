package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] byName = new Item[items.length];
        int num = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                byName[num] = items[i];
                num++;
            }
        }
        return Arrays.copyOf(byName, num);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item iTem) {
        int index = indexOf(id);
        boolean temp = false;
        if (index != -1) {
            items[index] = iTem;
            items[index].setId(id);
            temp = true;
        }
        return temp;
    }
}