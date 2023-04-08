
package com.spring.movieticketbooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class RatingsAndReviewsDTO {

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RatingDTO {
	private int  movieId;

	private Double rating;

	private String review;


}

}
