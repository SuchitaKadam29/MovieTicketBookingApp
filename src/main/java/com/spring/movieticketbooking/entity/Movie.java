package com.spring.movieticketbooking.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Movie {
	@Id
	@Column(name="movie_id")
	int movieId;
	@Column(name="movie_title")
	String movieTitle;
	String genre;
	String director;
	int duration;
	double rating;
    

}

