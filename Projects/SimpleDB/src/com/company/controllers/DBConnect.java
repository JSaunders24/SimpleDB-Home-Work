package com.company.controllers;

import com.company.models.Movie;

import java.sql.*;
import java.util.ArrayList;

//DBConnect.forName("org.sqlite.JDBC");

public class DBConnect {

    private String dbName;
    private String url;

//    Class.forName("org.sqlite.JDBC");

    public DBConnect(String dbName) {
        this.dbName = dbName;
        this.url = "jdbc:sqlite:C:/sqlite/db/" + dbName;
    }

    public void createNewDatabase() {

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addTables(){

        String sql = "CREATE TABLE IF NOT EXISTS movies (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	title text NOT NULL,\n"
                + "	releaseDate text NOT NULL,\n"
                + " rating text NOT NULL\n"
                + ");";

        try(Connection conn = DriverManager.getConnection(url)){
            Statement statement = conn.createStatement();
            statement.execute(sql);
            System.out.println("Tables added");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void addData(String title, String releaseDate, String rating){

        String sql = "INSERT INTO movies(title, releaseDate, rating) VALUES ('" + title + "', '" + releaseDate + "', '" + rating + "');";
        System.out.println(sql);
        try(Connection conn = DriverManager.getConnection(url)){
            Statement statement = conn.createStatement();
            statement.execute(sql);
            System.out.println("Data added");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public ArrayList<Movie> getData(){
        String sql = "SELECT id, title, releaseDate, rating FROM movies";
        ArrayList<Movie> movieList = new ArrayList<Movie>();

        try(Connection conn = DriverManager.getConnection(url)){
            Statement statement = conn.createStatement();
            ResultSet movies = statement.executeQuery(sql);
            while(movies.next())
            {
                int id = movies.getInt("id");
                String title = movies.getString("title");
                String releaseDate = movies.getString("releaseDate");
                String rating = movies.getString("rating");
                Movie movie = new Movie(id, title, releaseDate, rating);

                movieList.add(movie);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return movieList;
    }
}
