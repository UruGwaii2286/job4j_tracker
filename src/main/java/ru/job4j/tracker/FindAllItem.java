package ru.job4j.tracker;

import java.util.List;

public class FindAllItem implements UserAction {
    private final Output out;

    public FindAllItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ===");
       List<Item> items = tracker.findAll();
        if (items.isEmpty()) {
            out.println("Хранилище еще не содержит заявок.");
        } else {
            for (Item item : items) {
                out.println(item);
            }
        }
        return true;
    }
}
