package com.spring.movieticketbooking.service;

import java.util.List;

import com.spring.movieticketbooking.entity.RatingsAndReviews;
import com.spring.movieticketbooking.exception.MovieException;

public interface IRatingsAndReviewsService {
	


public RatingsAndReviews addReview(RatingsAndReviews ratingsDTO) throws MovieException;
	
	public List<RatingsAndReviews> getRatingsBymovieName(String moviename);


}
