package com.cognifide.homework.controller;

import com.cognifide.homework.entity.BookDTO;
import com.cognifide.homework.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/")
public class CategoryController {

    private CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping("category/{category}")
    public List<BookDTO> getBooksByCategory(@PathVariable String category) {
        return service.findBooksByCategory(category);
    }

}

