package com.cognifide.homework.controller;

import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.service.BookService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/")
public class BookController {

    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("book/{isbn}")
    public Item getBook(@PathVariable String isbn) {
        return bookService.findBookByISBN(isbn);
    }

}
