/* Author name: Anjali Smith
This class represents a song with data attributes to represent the song's title, artist, genre, and a Date object for its release date. It has two constructors, one of which set's the object's data attributes. It has a method that creates a new Song object from the user input, a printString() method that returns a string of the data's attributes and a display() method that prints out the song's data attributes to the console. Lastly it has getter methods for the data attributes. */

import java.io.Serializable;

public class Song implements Serializable {
 
 private String title;
 private String artist;
 private String genre;
 private Date releaseDate;

 public Song() {
 }
 public Song( String t, String a, String g, Date rd) {
  title = t;
  artist = a;
  genre = g;
  releaseDate = rd;
 }
/* This method prompts the user to enter information for each data attribute of a Song object, and it then creates a new Song object and passes the data to the object's constructor. Lastly, it returns the Song object. */
 public static Song makeSongFromUserInput() {
  
  String songName = Input.getString("Enter the song's name: ");  
  String artist = Input.getString("Enter the artist's name: ");
  String genre = Input.getString("Enter the genre: ");
  int month = Input.getInt("Enter the number of the month the song was released: ");
  int day = Input.getInt("Enter the day the song was released: ");
  int year = Input.getInt("Enter the year the song was released: ");
  Date releaseDate = new Date(month, day, year);
  Song song = new Song(songName, artist, genre, releaseDate);
  return song;
 }

 public String printString(){
  return "Song title: " + this.getTitle() + "  Artist name: " + this.getArtist() + "  genre: " + this.getGenre() + "  release date: " + this.getDate().getDate() ;
 }  


 public void display() {
     System.out.println("Song title: " + this.getTitle() + "  Artist name: " + this.getArtist() + "  genre: " + this.getGenre() + "  release date: " + this.getDate().getDate());
 }

 public String getTitle() {
  return title;
 }
 public String getArtist() {
  return artist;
 }
 public String getGenre() {
  return genre;
 }
 public Date getDate() {
  return releaseDate;
 }

}
