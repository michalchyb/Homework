package com.cognifide.homework.service;

import com.cognifide.homework.entity.BookDTO;
import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.utils.Helpers;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static com.cognifide.homework.utils.Helpers.getBookDTO;

@Service
public class CategoryService {

    private List<Item> listOfItems = Helpers.getJsonFromFile().getItems();

    public CategoryService() throws IOException {
    }

    public List<BookDTO> findBooksByCategory(String category) {
        List<BookDTO> result = new LinkedList<>();
        for (Item item : listOfItems) {
            if (item.getVolumeInfo().getCategories() == null) {
            } else if (item.getVolumeInfo().getCategories().contains(category)) {
                BookDTO bookDTO = getBookDTO(item);

                result.add(bookDTO);
            }
        }
        return result;
    }
}
