package com.spring.movieticketbooking.dto;

import java.time.LocalDate;

import com.spring.movieticketbooking.entity.Movie;
import com.spring.movieticketbooking.entity.Theatre;
import com.spring.movieticketbooking.entity.User;

import lombok.Data;


@Data
public class BookingDTO {
	
	private Long id;
    private User user;   
    private Movie movie;   
    private Theatre theater;
    private String seats;
    private LocalDate bookingDate;
    


}
