package com.techelevator.model.jdbc;

import com.techelevator.model.MovieDAO;

import com.techelevator.model.Genre;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.model.Movie;

public class JDBCMovieDAO implements MovieDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public JDBCMovieDAO( DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Movie getByReleaseYear(int releaseYear) {
		String query = "SELECT film_name, description, release_year, length, rating" +
	"FROM bad_films" +
	"WHERE release_year =?";
		SqlRowSet results = this.jdbcTemplate.queryForRowSet(query, releaseYear);
		
		Movie toReturn = null;
		if(results.next()) {
			 toReturn = this.mapRowToMovie(results, new ArrayList<Genre>());
			
		}
		return null;
	}

	@Override
	public List<Movie> getByGenre(String genreName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getByGenre(List<String> genreNames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAllRazzieWinners() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Movie mapRowToMovie(SqlRowSet row, List<Genre> genres) {
		Movie theMovie = new Movie(genres);
		theMovie.setReleaseYear(row.getInt("release_year"));
		theMovie.setDescription(row.getString("description"));
		theMovie.setName(row.getString("film_name"));
		theMovie.setLength(row.getInt("length"));
		theMovie.setRating(row.getString("rating"));
		theMovie.setRazzieWinner(row.getBoolean("razzie_winner"));
		
		return theMovie;
		
	}

}
