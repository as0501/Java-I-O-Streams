import java.io.*;
public class WriteSongData {
 
  private String fileName;

  public Song makeSongFromUserInput() {
  
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
  public void writeToFile(Song song) {
  fileName = Input.getString("Enter a file name: ");
  try {
    ObjectOutputStream out = new ObjectOutputStream ( new BufferedOutputStream ( new FileOutputStream (fileName)));
    out.writeObject(song);
    out.close();
  }

  catch (Exception ex) {
   System.out.println("An exception was thrown!");
  }
  
 }





 }
