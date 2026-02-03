package com.streamapi.top5trendingmovies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MovieMain {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
				new Movie("Inception", 8.8,2000),
				new Movie("The Dark Knight", 9.0,2020),
				new Movie("Interstellar", 8.6,2024),
				new Movie("Parasite", 8.6,2030),
				new Movie("Avengers: Endgame", 8.4,2018),
				new Movie("Joker", 8.5,2016)
		);
		movies.stream()
					   .filter(m -> m.getReleaseYear()>2018)
		               .sorted(Comparator.comparing(Movie::getRating).reversed()
		            		   .thenComparing(Movie::getReleaseYear).reversed())
					   .limit(5)
	                   .forEach(System.out::println);
	}
		               
		               

}

