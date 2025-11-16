package com.simpleProject.GeoDiary.controllers;

import com.simpleProject.GeoDiary.services.ReviewService;
import com.simpleProject.GeoDiary.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Constants.REVIEW_API)
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
}
