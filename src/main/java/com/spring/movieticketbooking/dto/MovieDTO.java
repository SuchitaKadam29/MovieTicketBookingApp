package com.spring.movieticketbooking.dto;

import java.time.LocalDate;

import com.spring.movieticketbooking.entity.Movie;

import lombok.Data;

@Data
public class MovieDTO {
	
	private Movie title;
    private String genre;
    private LocalDate releaseDate;
}
	
