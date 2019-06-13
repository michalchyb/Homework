package com.cognifide.homework.entity;

import java.util.List;

public class RatingDTO implements Comparable<RatingDTO> {
    private List<String> authors = null;
    private Double averageRating;

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public int compareTo(RatingDTO ratingDTO) {
        return this.getAverageRating().compareTo(ratingDTO.getAverageRating());
    }
}
