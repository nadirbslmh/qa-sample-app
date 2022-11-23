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

    public void getAll() {
        System.out.println("==ITEMS DATA==");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("===");
            System.out.println("name: " + items.get(i).getName());
            System.out.println("price: " + items.get(i).getPrice());
            System.out.println("===");
        }
    }

    public void getByIdx(int index) {
        System.out.println("===");
        System.out.println("name: " + items.get(index).getName());
        System.out.println("price: " + items.get(index).getPrice());
        System.out.println("===");
    }
}
