package com.cognifide.homework.service;

import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.utils.Helpers;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Service
public class RatingService {


    private List<Item> listOfItems = Helpers.getJsonFromFile().getItems();

    public RatingService() throws IOException {
    }

    public List<String> authorsRating() {
        List<String> result = new LinkedList<>();
        for (Item item : listOfItems) {


            if (item.getVolumeInfo().getAuthors() != null && item.getVolumeInfo().getAverageRating() != null) {

                String tempAuthor = item.getVolumeInfo().getAuthors().toString().replace("[","").replace("]","");
//                double tempAvgRating = Float.parseFloat(item.getVolumeInfo().getAverageRating());
                result.add(tempAuthor + item.getVolumeInfo().getAverageRating());
            }
        }
        return result;
    }
}