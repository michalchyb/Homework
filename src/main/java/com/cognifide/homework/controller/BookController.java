package com.cognifide.homework.controller;

import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("book/{isbn}")
    public ResponseEntity<Item> getBook(@PathVariable String isbn) {
        return new ResponseEntity<>(bookService.findBookByISBN(isbn), HttpStatus.OK);
    }

}
