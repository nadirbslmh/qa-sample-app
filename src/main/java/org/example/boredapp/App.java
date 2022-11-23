package org.example.boredapp;

import org.example.boredapp.entity.Item;
import org.example.boredapp.service.ItemService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();

        Item firstItem = new Item("milk",29);
        Item secondItem = new Item("cereal",22);
        Item thirdItem = new Item("apple",23);

        itemService.create(firstItem);
        itemService.create(secondItem);
        itemService.create(thirdItem);

        List<Item> itemList = itemService.getAll();

        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i).getName());
            System.out.println(itemList.get(i).getPrice());
        }

        Item foundItem = itemService.getByIdx(2);

        System.out.println(foundItem.getName());
        System.out.println(foundItem.getPrice());
    }
}
