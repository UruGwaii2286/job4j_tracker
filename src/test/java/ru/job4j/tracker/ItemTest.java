package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void comparableSort() {
        List<Item> items = Arrays.asList(
                new Item(1, "A"),
                new Item(6, "B"),
                new Item(3, "C")
        );
        Collections.sort(items);
        List<Item> expected = Arrays.asList(
                new Item(1, "A"),
                new Item(3, "C"),
                new Item(6, "B")
        );
        assertEquals(expected, items);
    }

    @Test
    public void itemAscByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "C"),
                new Item(6, "A"),
                new Item(3, "B")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(6, "A"),
                new Item(3, "B"),
                new Item(1, "C")
        );
        assertEquals(expected, items);
    }

    @Test
    public void itemDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "B"),
                new Item(6, "C"),
                new Item(3, "A")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(6, "C"),
                new Item(1, "B"),
                new Item(3, "A")
        );
        assertEquals(expected, items);
    }
}