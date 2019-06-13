package com.cognifide.homework.utils;

import com.cognifide.homework.entity.BookDTO;
import com.cognifide.homework.entity.jsonpojo.Book;
import com.cognifide.homework.entity.jsonpojo.Item;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Helpers {

    private Helpers() {
    }

    public static Book getJsonFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(Helpers.class.getClassLoader().getResource("books.json").getFile()), Book.class);
    }


    public static BookDTO getBookDTO(Item item) {

        BookDTO bookDTO = new BookDTO();

        setCorrectIsbn(item, bookDTO);
        bookDTO.setTitle(item.getVolumeInfo().getTitle());
        bookDTO.setSubtitle(item.getVolumeInfo().getSubtitle());
        bookDTO.setPublisher(item.getVolumeInfo().getPublisher());
        bookDTO.setPublishedDate(item.getVolumeInfo().getPublishedDate());
        bookDTO.setDescription(item.getVolumeInfo().getDescription());
        bookDTO.setPageCount(item.getVolumeInfo().getPageCount());
        bookDTO.setThumbnailUrl(item.getVolumeInfo().getImageLinks().getThumbnail());
        bookDTO.setLanguage(item.getVolumeInfo().getLanguage());
        bookDTO.setPreviewLink(item.getVolumeInfo().getPreviewLink());
        setCorrectAverageRating(item, bookDTO);
        bookDTO.setAuthors(item.getVolumeInfo().getAuthors());
        bookDTO.setCategories(item.getVolumeInfo().getCategories());
        return bookDTO;
    }

    private static void setCorrectAverageRating(Item item, BookDTO bookDTO) {
        if (item.getVolumeInfo().getAverageRating() != null) {
            bookDTO.setAverageRating(item.getVolumeInfo().getAverageRating());
        } else {
            bookDTO.setAverageRating(0.0);
        }
    }

    private static void setCorrectIsbn(Item item, BookDTO bookDTO) {
        if (item.getVolumeInfo().getIndustryIdentifiers().toString().contains("ISBN_13")) {

            if (item.getVolumeInfo().getIndustryIdentifiers().get(0).getType().contains("ISBN_13")) {
                bookDTO.setIsbn(item.getVolumeInfo().getIndustryIdentifiers().get(0).getIdentifier());
            } else {
                bookDTO.setIsbn(item.getVolumeInfo().getIndustryIdentifiers().get(1).getIdentifier());
            }
        } else {

            bookDTO.setIsbn(item.getId());
        }
    }
}
