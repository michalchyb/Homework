package com.cognifide.homework.service;

import com.cognifide.homework.entity.RatingDTO;
import com.cognifide.homework.entity.jsonpojo.Item;
import com.cognifide.homework.utils.Helpers;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RatingService {


    private List<Item> listOfItems = Helpers.getJsonFromFile().getItems();

    public RatingService() throws IOException {
    }

    public List<RatingDTO> authorsRating() {
        List<RatingDTO> result = new ArrayList<>();
        for (Item item : listOfItems) {
            if (item.getVolumeInfo().getAuthors() != null && item.getVolumeInfo().getAverageRating() != null) {
                RatingDTO ratingDTO = new RatingDTO();
                ratingDTO.setAuthors(item.getVolumeInfo().getAuthors());
                ratingDTO.setAverageRating(item.getVolumeInfo().getAverageRating());
                result.add(ratingDTO);
            }
        }
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}