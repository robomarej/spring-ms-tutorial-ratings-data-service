package com.robomarej.tutorials.ratingsdataservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRating {

    private String userId;
    private List<Rating> ratings;
}
