package org.example.boredapp.service;

import org.example.boredapp.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private List<Item> items;

    public ItemService() {
        this.items = new ArrayList<>();
    }

    public void create(Item item) {
        items.add(item);
    }

    public List<Item> getAll() {
        return items;
    }

    public Item getByIdx(int index) {
        return items.get(index);
    }
}
