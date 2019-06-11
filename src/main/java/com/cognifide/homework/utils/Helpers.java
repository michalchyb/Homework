package com.cognifide.homework.utils;

import com.cognifide.homework.entity.jsonpojo.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Helpers {
    public static Book getJsonFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(Helpers.class.getClassLoader().getResource("books.json").getFile()), Book.class);

    }
}
