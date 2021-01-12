package com.sherold.store.Controllers;

import com.sherold.store.DTO.CategoryDto;
import com.sherold.store.DTO.ItemCategoryDto;
import com.sherold.store.DTO.ItemDto;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/item")
public class ItemController {

    //testing only
    @GetMapping("/all")
    public void getAll() {
        //TODO:
    }

    @GetMapping("/{id}")
    public ItemDto getItem(@PathVariable("id") int id) {
        //TODO:
        return new ItemDto();
    }

    @GetMapping("/category/{id}")
    public CategoryDto getCategories(@PathVariable("id") int id) {
        //TODO: return array
        return new CategoryDto();
    }

    @PostMapping("/category/add/{itemId}/{categoryId}")
    public boolean addCategory(@PathVariable("itemId") int itemId, @PathVariable("categoryId") int categoryId) {
        //TODO:
        return true;
    }

    @PostMapping("/category/remove/{itemId}/{categoryId}")
    public boolean removeCategory(@PathVariable("itemId") int itemId, @PathVariable("categoryId") int categoryId) {
        //TODO:
        return true;
    }

    @PostMapping("/create")
    public ItemDto createItem(@RequestBody ItemDto newItem) {
        //TODO:
        return new ItemDto();
    }

    @PostMapping("/update")
    public ItemDto updateItem(@RequestBody ItemDto updatedItem) {
        //TODO:
        return new ItemDto();
    }

    @PostMapping("/delete")
    public boolean deleteItem(@RequestBody ItemDto deletedItem) {
        //TODO:
        return true;
    }
}
