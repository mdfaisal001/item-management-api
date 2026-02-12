package com.faisal.itemapi.service;

import com.faisal.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private Long idCounter = 1L;

    // Add new item
    public Item addItem(Item item) {
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    // Get item by ID
    public Item getItemById(Long id) {
        Optional<Item> foundItem = items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();

        return foundItem.orElse(null);
    }

    // Get all items
    public List<Item> getAllItems() {
        return items;
    }
}
