package com.spring.movieticketbooking.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
@Entity
public class Shows {
	

	@Id
	@Column(name = "show_id")
	int showId;

	@ManyToOne
	@JoinColumn(name = "theatre_id")
	private Theater theatre;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@Column(name = "show_date")
	Date showDate;

	@Column(name = "show_time")
	Time showTime;

	@Column(name = "available_seats")
	int availableSeats;



}


