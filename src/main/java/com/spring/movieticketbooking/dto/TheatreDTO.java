package com.spring.movieticketbooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TheatreDTO {
	
	private	int theatreId;
	private String theatreName;
	private	String location;
	private int seatingCapacity;

}
