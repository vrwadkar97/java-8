package com.consumer.fi;

public class Movie {
	private String movieName;
	

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + "]";
	}
	
	

}
