package com.cognifide.homework.service;

import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.utils.Helpers;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class BookService {

    List<Item> listOfItems = Helpers.getJsonFromFile().getItems();

    public BookService() throws IOException {
    }

    public Item findBookByISBN(String isbn) {

        for (Item item : listOfItems) {
            if (item.getVolumeInfo().getIndustryIdentifiers().get(0).getType().equals(isbn)) {
                return item;
            }

        }
        return null;
    }
}
