package com.cognifide.homework;

import com.cognifide.homework.entity.JsonData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(HomeworkApplication.class, args);
        JsonData jsonData = new JsonData();
    }
}
