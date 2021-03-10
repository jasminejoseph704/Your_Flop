package com.techelevator.model;

import java.util.List;

import java.util.ArrayList;
public class Movie {
	
	private int id;
	
	private String description;
	
	private int releaseYear;
	
	private int length;
	
	private String name;
	
	private boolean razzieWinner;
	
	private List<Genre> genres;
	
	
	public Movie(List<Genre> genres) {
		this.genres = genres == null ? new ArrayList<Genre>() : genres;
	}
	
	
	public Genre[] getGenres() {
		Genre [] genresArray = new Genre[this.genres.size()];
		return this.genres.toArray(genresArray);
	}
	
	public boolean isRazzieWinner() {
		return razzieWinner;
	}

	public void setRazzieWinner(boolean razzieWinner) {
		this.razzieWinner = razzieWinner;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	private String rating;
	

}
