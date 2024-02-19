package com.fiala.bookbeam.controller;

import com.fiala.bookbeam.requestmodels.ReviewRequest;
import com.fiala.bookbeam.service.ReviewService;
import com.fiala.bookbeam.utils.ExtractJWT;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://bookbeam-1nzt7ybq0-abdulrahmanfiala.vercel.app")
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private ReviewService reviewService;

    public ReviewController (ReviewService reviewService){
        this.reviewService = reviewService;
    }

    @GetMapping("/secure/user/book")
    public Boolean reviewBookByUser(@RequestHeader(value="Authorization") String token,
                                    @RequestParam Long bookId) throws Exception{
        String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");

        if (userEmail == null){
            throw new Exception("User email is missing");
        }
        return reviewService.userReviewListed(userEmail, bookId);
    }
    @PostMapping("/secure")
    public void postReview(@RequestHeader(value = "Authorization") String token,
                           @RequestBody ReviewRequest reviewRequest) throws Exception
    {
        String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
        if(userEmail == null){
            throw  new Exception("User email is missing");
        }
        reviewService.postReview(userEmail, reviewRequest);
    }
}
