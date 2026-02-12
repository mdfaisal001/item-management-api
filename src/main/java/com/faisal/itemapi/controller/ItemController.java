package com.faisal.itemapi.controller;

import com.faisal.itemapi.model.Item;
import com.faisal.itemapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    // Constructor Injection
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // 1️⃣ Add Item
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item addItem(@Valid @RequestBody Item item) {
        return itemService.addItem(item);
    }

    // 2️⃣ Get Item by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        Item item = itemService.getItemById(id);

        if (item == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found");
        }

        return item;
    }

    // 3️⃣ Get All Items
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
