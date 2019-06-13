package com.cognifide.homework.entity;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatingDTO ratingDTO = (RatingDTO) o;
        return Objects.equals(authors, ratingDTO.authors) &&
                Objects.equals(averageRating, ratingDTO.averageRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authors, averageRating);
    }
}
