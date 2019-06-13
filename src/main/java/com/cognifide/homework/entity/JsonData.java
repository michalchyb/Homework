package com.cognifide.homework.entity;

import com.cognifide.homework.entity.jsonpojo.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class  JsonData  {

    public Book getJsonFromFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(getClass().getClassLoader().getResource("books.json").getFile()), Book.class);

    }
}
