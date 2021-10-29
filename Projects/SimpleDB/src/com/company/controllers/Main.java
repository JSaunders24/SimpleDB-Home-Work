package com.company.controllers;


import com.company.models.Movie;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       DBConnect db = new DBConnect("movies.db");
       Movie newMovie = new Movie(0, " ", " ", "");
       db.createNewDatabase();

       db.addTables();

       Scanner input = new Scanner(System.in);
       boolean stringCheck = false;

       while (stringCheck == false) {

           System.out.println("Enter a movie title \n");
           newMovie.setTitle(input.next());

           if (!(newMovie.getTitle() instanceof String)) {
               System.out.println("Title not a String \n");
               stringCheck = false;
           }


           System.out.println("Enter the release year \n");
           newMovie.setReleaseYear(input.next());

           if (!(newMovie.getReleaseYear() instanceof String)) {
               System.out.println("Release Year not a String \n");
               stringCheck = false;
           }

           System.out.println("Enter the rating \n");
           newMovie.setRating(input.next());

           if (!(newMovie.getRating() instanceof String)) {
               System.out.println("Rating not a String \n");
               stringCheck = false;
           }

           if (((newMovie.getTitle() instanceof String)) && ((newMovie.getReleaseYear() instanceof String)) && ((newMovie.getRating() instanceof String))) {
                stringCheck = true;
           }
       }


       db.addData(newMovie.getTitle(), newMovie.getReleaseYear(), newMovie.getRating());

//       db.addData("Star Wars", "1977", "PG");
//       db.addData("CODA", "2021", "PG-13");
//       db.addData("The Life of Emile Zola", "1937", "NR");
//       db.addData("The Night House", "2021", "R");



       ArrayList<Movie> theMovies = db.getData();
        for(Movie movie : theMovies){
            System.out.println(movie.toString());
        }


    }
}
