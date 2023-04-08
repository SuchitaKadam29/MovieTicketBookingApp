package com.spring.movieticketbooking.service;

import java.util.List;

import com.spring.movieticketbooking.entity.Shows;

public interface IShowsService {
	
	
public List<Shows> getShows();
	
	public List<Shows> searchShowsByTitle(String movieTitle);

}


