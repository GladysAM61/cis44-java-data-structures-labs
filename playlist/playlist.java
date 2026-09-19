/**
 *
 * @author gladysarias
 */
public class playlist {
     
    //node class
    private static class Node {
        //a song variable that is a song
        song song;
        //a node variable that is next
        Node next;

        // storing the song in the node
        public Node(song song) {
            this.song = song;
            this.next = null; // next song is empty
        }
    }
    
    //creating the nodes head 
    private Node head;
     //creating the nodes tail 
    private Node tail;
    //the current node
    private Node currentNode;
    //the size of the linked list
    private int size;

    //constructor
    public playlist() {
        this.head = null;
        this.tail = null;
        this.currentNode = null;
        this.size = 0;
    }
    
    //adding the song into the linked list
    public void addSong(song song) {
        //creating a new node that will be a song
       Node newSong = new Node(song);
        //if the head is empty, then this will be the first song 
        //this means we set the tail,head,and current node equal to this song
        if (head == null) {
            head = newSong;
            tail = newSong;
            currentNode = newSong; 
        }
        //otherwise,add the song to the list
        else {
            tail.next = newSong; // Connect the current last node to the new node
            tail = newSong;      // Update the tail marker to be the new node
        }
        //lastly increment the size of the playlist
        size++;
    }

    public void removeSong(String title) {
        // Handle two cases: removing the head and removing from elsewhere.
        // Don't forget to update the tail if the last song is removed.
        
        //first,check if the playlist is empty
        if (head == null) {
            return;
        }
        
        //case 1:removing the head
        //if statement to compare if they want the song tahts the head removed
        if (head.song.getTitle().equalsIgnoreCase(title)) {
            // If head was also currentNode, we move to the next song
            if (currentNode == head) {
               currentNode = head.next;
             }
            //we move onto the next song
            head = head.next; 
            //since we removed a song, the playlist is less one so we decrement the song
            size--;

        // If the head was the only song before being removed, then the playlist is now empty
        //this means we need to remove the tail too
            if (head == null) {
            tail = null;
            }
            return;
        }
        
        //case 2: remove it from a normal and random spot
        //we start at the head and move forwards so we make head the current one
        Node current = head;
        //while we are not at the end of the list, run this code
        while (current.next != null) {
        // Look at the next song since we need the song before and after
        if (current.next.song.getTitle().equalsIgnoreCase(title)) {
          //the song we want to delete
            Node delete = current.next;
          
            
            //if the current node we are on is the song we want to delete, then replace it with the next one
            if (currentNode == delete) {
                currentNode = delete.next;
            }
            
            // we update tail if deleting the last song
            if (delete == tail){
                tail = current;
            } 

            current.next = delete.next;
            size--;
            return;
        }
        current = current.next; // Move to next node
    }
        
    }
    
    public void playNext() {
        
        //first, we check if the playlist is empty
        if(size==0){
           System.out.print("The playlist is empty");
           return;
        }
        
        
        //if its not empty,then we print out the current song playing 
        // If currentNode is null, start from the head.
        if(currentNode == null){
            currentNode = head;
        }
        
        // we print out the details for the current song or node
        System.out.printf("Currently playing: " + currentNode.song.getTitle() + " by " + currentNode.song.getArtist() + "\n");
        
        // Otherwise, advance to the next node.
        // Step 2: Advance to next song (wrap around if at the end)
        //if its not the last one, then move onto the next one
        if (currentNode.next != null) {
           currentNode = currentNode.next; 
        } 
        //if it is the last one, then go back to the head note
        else {
           currentNode = head; 
        }
        // If you reach the end, loop back to the head.
    }
    
    //printing out the whole playlist
    public void displayPlaylist() {
        // Traverse from the head and print each song.
        // If currentNode is null, start from the head.
        if(currentNode == null){
            currentNode = head;
        }
      //displaying the number of songs in playlist 
      System.out.printf("You currently have %d songs in your playlist\n", size);
      System.out.printf("Playlist:\n");
      //while loop to print out every node or song
      while(currentNode!=null){
          System.out.printf("%s by %s\n",currentNode.song.getTitle(),currentNode.song.getArtist());
           currentNode = currentNode.next;
      }
      
    }
    
}
