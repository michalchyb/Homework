package com.cognifide.homework.utils;

import com.cognifide.homework.entity.BookDTO;
import com.cognifide.homework.entity.jsonpojo.Book;
import com.cognifide.homework.entity.jsonpojo.Item;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Helpers {

    private Helpers() {
    }

    public static Book getJsonFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(Objects.requireNonNull(Helpers.class.getClassLoader().getResource("books.json")).getFile()), Book.class);

    }


    public static BookDTO getBookDTO(Item item) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setIsbn(item.getVolumeInfo().getIndustryIdentifiers().get(0).getIdentifier());
        bookDTO.setTitle(item.getVolumeInfo().getTitle());
        bookDTO.setSubtitle(item.getVolumeInfo().getSubtitle());
        bookDTO.setPublisher(item.getVolumeInfo().getPublisher());
        bookDTO.setPublishedDate(item.getVolumeInfo().getPublishedDate());
        bookDTO.setDescription(item.getVolumeInfo().getDescription());
        bookDTO.setPageCount(item.getVolumeInfo().getPageCount());
        bookDTO.setThumbnailUrl(item.getVolumeInfo().getImageLinks().getThumbnail());
        bookDTO.setLanguage(item.getVolumeInfo().getLanguage());
        bookDTO.setPreviewLink(item.getVolumeInfo().getPreviewLink());
        bookDTO.setAverageRating(item.getVolumeInfo().getAverageRating());
        bookDTO.setAuthors(item.getVolumeInfo().getAuthors());
        bookDTO.setCategories(item.getVolumeInfo().getCategories());
        return bookDTO;
    }
}
