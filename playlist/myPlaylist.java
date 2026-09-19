/**
 *
 * @author gladysarias
 */
public class myPlaylist {
    public static void main(String[] args) {
        //  Create a new playlist
        playlist newPlaylist = new playlist();
        //creating songs
        song first = new song("La cita fresita","Grupo Aztecca");
        song second = new song("Los cuadros","Grupo Cuadra");
        song third = new song("Headlines","Drake");
        song fourth = new song("Love Bomb","Jhene Aiko & Ab-Soul");
        song fifth = new song("Donde estas","Barbas & Omar Camacho");
        song sixth = new song("BbY WOW","KAROL G,Judeline & rusowsky");
        //adding them to the playlist
        newPlaylist.addSong(first);
        newPlaylist.addSong(second);
        newPlaylist.addSong(third);
        newPlaylist.addSong(fourth);
        newPlaylist.addSong(fifth);
        newPlaylist.addSong(sixth);
        //removing the song healdlines from the playlist
        newPlaylist.removeSong("Headlines");
        
        
        //displaying the next song
        newPlaylist.displayPlaylist();
        
        newPlaylist.playNext();
      
    }
}
