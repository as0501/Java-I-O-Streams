import java.io.*;
public class ReadSongData {
 
  private String fileName;

  public void readFile() {
  try {
    fileName = Input.getString("Enter a file name: ");
    ObjectInputStream in = new ObjectInputStream ( new BufferedInputStream ( new FileInputStream (fileName)));
     while ( in.available() > 0) {
         Song song = (Song)in.readObject(); 
          song.display();
       }
    in.close();
  }

  catch (Exception ex) {
    System.out.println("An exception was thrown!");
  }
 }
  
 
 }
   
