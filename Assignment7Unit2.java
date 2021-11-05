public class Assignment7Unit2 {

 public static void main ( String [] args) {

   WriteSongData write = new WriteSongData();
   ReadSongData read = new ReadSongData();
 
   Song song1 = write.makeSongFromUserInput();
   Song song2 = write.makeSongFromUserInput();
   Song song3 = write.makeSongFromUserInput();
   Song song4 = write.makeSongFromUserInput();
   Song[] songArray = { song1, song2, song3, song4};
    for ( int i = 0; i < 4; i++) {
      write.writeToFile(songArray[i]);
    }
   read.readFile();
  }
}
