package com.example.service;

import com.example.entity.*;
import com.example.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public boolean deleteItem(Long id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean processFormAndFin(String form, String fin) {
        // Example logic: return true if both form and fin are not null or empty
        return form != null && !form.isEmpty() && fin != null && !fin.isEmpty();
    }
}
