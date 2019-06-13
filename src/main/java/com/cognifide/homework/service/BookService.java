package com.cognifide.homework.service;

import com.cognifide.homework.entity.BookDTO;
import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.utils.Helpers;

import java.io.IOException;
import java.util.List;

import static com.cognifide.homework.utils.Helpers.getBookDTO;

@org.springframework.stereotype.Service
public class BookService {

    private List<Item> listOfItems = Helpers.getJsonFromFile().getItems();

    public BookService() throws IOException {
    }

    public BookDTO findBookByISBN(String isbn) {
        for (Item item : listOfItems) {

            if (item.getVolumeInfo().getIndustryIdentifiers().toString().contains(isbn)) {
                return getBookDTO(item);
}
        }
        return null;
    }
}
