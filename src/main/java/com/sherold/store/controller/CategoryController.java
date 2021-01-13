package com.sherold.store.Controllers;

import com.sherold.store.DTO.CategoryDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    //testing only
    @GetMapping("/all")
    public void getAllCategories() {
        //TODO: update return type and implement
    }

    @GetMapping("/{id}")
    public CategoryDto getCategory(@PathVariable("id") int id) {
        //TODO:
        return new CategoryDto();
    }

    @GetMapping("/sub/{id}")
    public void getSubCategories(@PathVariable("id") int id) {
        //TODO:
    }

    @GetMapping("/parent/{id}")
    public CategoryDto getParentCategory(@PathVariable("id") int id) {
        //TODO:
        return new CategoryDto();
    }
}
