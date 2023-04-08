package com.spring.movieticketbooking.service;

import java.util.List;

import com.spring.movieticketbooking.entity.Movie;

public interface IMovieService {
public List<Movie> getMovies();
	
	public List<Movie>searchMoviesByKeyword(String keyword);
	

}
	
