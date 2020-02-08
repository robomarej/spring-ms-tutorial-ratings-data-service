package com.robomarej.tutorials.ratingsdataservice.controller;

import com.robomarej.tutorials.ratingsdataservice.model.Rating;
import com.robomarej.tutorials.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getRatings(@PathVariable("userId") String userId){
        UserRating userRating = new UserRating();
        userRating.setRatings(Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        ));
        return userRating;
    }
}
