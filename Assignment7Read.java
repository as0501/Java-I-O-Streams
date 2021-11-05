/*Author name: Anjali Smith
This class reads the Song data by first asking the user for the name of the file to read, creating an input stream for that file, and then reading the array from the file. It has a for loop that calls the display() method from the Song class for each Song object in the array. */
import java.io.*;

public class Assignment7Read {

 public static void main ( String [] args) {
    readFile();
 }
 public static void readFile() {
    try {
      String fileName = Input.getString("Enter a file name: ");
      ObjectInputStream in = new ObjectInputStream ( new BufferedInputStream ( new FileInputStream (fileName)));
      Song songArray[] = (Song[]) in.readObject(); 
      for(int i=0 ; i<songArray.length; i++) {
        songArray[i].display();
       } 
      in.close(); 
    }

    catch (Exception ex) {
      System.out.println("An exception was thrown!");
    }
 }  
}
 
