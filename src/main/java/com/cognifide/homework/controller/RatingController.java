package com.cognifide.homework.controller;

import com.cognifide.homework.entity.RatingDTO;
import com.cognifide.homework.service.RatingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/")
public class RatingController {

    private RatingService service;

    public RatingController(RatingService service) {
        this.service = service;
    }

    @GetMapping("rating")
    public List<RatingDTO> getAuthorsRating() {
        return service.authorsRating();
    }
}
