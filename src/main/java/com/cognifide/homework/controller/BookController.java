package com.cognifide.homework.controller;

import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.service.BookService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("book/{isbn}")
    public Item getBook(@PathVariable String isbn) {
        return service.findBookByISBN(isbn);
    }

}
