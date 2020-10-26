package com.mycompany.filmes.app.db;

import java.util.ArrayList;

import com.mycompany.filmes.app.models.Movies;

public class MovieList {
	public static ArrayList<Movies> moviesList = new ArrayList<>();

	public MovieList() {
		moviesList.add(new Movies("Carros", 50.0));
		moviesList.add(new Movies("Joker", 20.0));
		moviesList.add(new Movies("Batman", 30.0));
                moviesList.add(new Movies("Interestelar", 40.0));
	}
}