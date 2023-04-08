package com.spring.movieticketbooking.service;

import java.util.List;

import com.spring.movieticketbooking.entity.Theater;

public interface ITheaterService {

	
public List<Theater> getTheatres();
	
	public List<Theater>searchTheatresByKeyword(String keyword);

}
