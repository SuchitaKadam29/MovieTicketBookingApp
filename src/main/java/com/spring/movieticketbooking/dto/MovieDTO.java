package com.spring.movieticketbooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieDTO {
 private int movieId;
 private String movieTitle;
 private String genre;
 private String director;
 private int duration;
 private double rating;


}