package com.streamapi.top5trendingmovies;

public class Movie {
	private String name;
	private double rating;
	private int releaseYear;

	public Movie(String name, double rating, int releaseYear) {
		this.name = name;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	@Override
	public String toString() {
		return name + " Rating: " + rating + " Release Year: " + releaseYear;
	}
}
