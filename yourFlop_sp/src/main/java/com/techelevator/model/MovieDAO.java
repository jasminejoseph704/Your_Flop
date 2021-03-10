package com.techelevator.model;

import java.util.List;
public interface MovieDAO {
	
	Movie getByReleaseYear(int year);
	
	List<Movie> getByGenre(String genreName);
	
	List<Movie> getByGenre(List <String> genreNames);
	
	List<Movie> getAllRazzieWinners();
	
	

}
