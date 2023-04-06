
package com.spring.movieticketbooking.dto;

import lombok.Data;

@Data
public class RatingsAndReviewsDTO {

	private Integer id;
    private Integer customerId;
    private Float rating;
    private String review;


}
