/**
 *
 * @author gladysarias
 */
import java.util.Scanner;

public class myPlaylist {
    public static void main(String[] args) {
        //  Create a new playlist
        playlist newPlaylist = new playlist();
        //creating a new scanner
        Scanner scanner = new Scanner(System.in);
        
        //where their choice while be kept
        int choice = 0;
        
        System.out.println("My Playlist:\n");
       //repeating while the user doesn't exit
       while (choice != 5) {
           System.out.println("Please pick what you would like to do: ");
           System.out.println("1. Add a song");
           System.out.println("2. Remove a song");
           System.out.println("3. Play the next song");
           System.out.println("4. Show all the playlist");
           System.out.println("5. Exit");
           System.out.print("Choose an option (1-5): ");
           
           if (scanner.hasNextInt()) {
               //storing their choice in choice
                choice = scanner.nextInt();
                scanner.nextLine();
           //if they pick 1, then we add a song to the playlist        
               if(choice ==1){
                   //asking them for the name of the song
                   System.out.print("Type the title of the song: ");
                   String title = scanner.nextLine();
                   //asking them for the artist of the song
                   System.out.print("Type the artist of the song: ");
                   String artist = scanner.nextLine();
                   newPlaylist.addSong(new song(title,artist));
               } 
             //if they pick 2, then we remove a song from the playlist
             if(choice ==2){
                   //asking them for the name of the song
                   System.out.print("Type the title of the song: ");
                   String title = scanner.nextLine();
                   newPlaylist.removeSong(title);
               } 
             
              //if they pick 3, then we play the next song
              if(choice == 3){
                  newPlaylist.playNext();
              }
             
               //if they pick 4, then we show the whole playlist
              if(choice == 4){
                  newPlaylist.displayPlaylist();
              }
              if(choice == 5){
                  scanner.close();
              }
           }
           
           
       }
        
        
      
      
    }
}
