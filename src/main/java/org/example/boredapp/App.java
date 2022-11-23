package org.example.boredapp;

import org.example.boredapp.entity.Item;
import org.example.boredapp.service.ItemService;

public class App {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();

        Item firstItem = new Item("milk",29);
        Item secondItem = new Item("cereal",22);
        Item thirdItem = new Item("apple",23);

        itemService.create(firstItem);
        itemService.create(secondItem);
        itemService.create(thirdItem);

        itemService.getAll();

        itemService.getByIdx(2);
    }
}
