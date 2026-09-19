/**
 *
 * @author gladysarias
 */
public class song {
    String title;
    String artist;
    // Constructor and getters...
    //contructor
    public song(String title,String artist){
        this.title=title;
        this.artist=artist;
    }
    //returning the song title
    public String getTitle(){
        return title;
    }
    
    //returning the artist
    public String getArtist(){
        return artist;
    }
    
}

