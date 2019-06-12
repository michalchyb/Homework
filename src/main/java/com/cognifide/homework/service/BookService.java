package com.cognifide.homework.service;

import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.utils.Helpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class BookService {
    private static final Logger logger = LogManager.getLogger(BookService.class);

    private List<Item> listOfItems = Helpers.getJsonFromFile().getItems();

    public BookService() throws IOException {
    }


    public Item findBookByISBN(String isbn) {
        for (Item item : listOfItems) {
            if (item.getVolumeInfo().getIndustryIdentifiers().get(0).getIdentifier().equals(isbn)) {
                return item;
            }
        }
        return null;
    }
}
