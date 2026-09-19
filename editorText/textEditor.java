/**
 *
 * @author gladysarias
 */
public class textEditor {
    private static class Node {
         String textState;
         Node prev;
         Node next;
        // Node constructor
         
        public Node(String textState) {
            this.textState = textState;
            this.prev = null; 
            this.next=null;
        }
    }

    private Node currentNode;
    
    
    public textEditor(){
        // Start with an initial empty string state.
        
        Node initialNode = new Node("");
        this.currentNode = initialNode;
    }

    public void add(String newText) {
        // Create a new node with the updated text.
        Node newNode = new Node(newText);
        // Set its 'prev' to the current node.
        newNode.prev = currentNode;
        // Set the current node's 'next' to this new node.
        currentNode.next = newNode;
        // Finally, update currentNode to point to the new node.
        currentNode = newNode;
    }
    
    public String undo() {
        // Check if currentNode.prev is not null.
        if(currentNode.prev != null){
             // If it is, move currentNode back and return the text.
             currentNode = currentNode.prev;
             
             return currentNode.textState;
        }else{
        //Otherwise, you can't undo.
            return currentNode.textState;
        }
    }
    
    public String redo() {
        // Check if currentNode.next is not null.
        if(currentNode.next != null){
        // If it is, move currentNode forward 
        currentNode = currentNode.next;
        //and return the text.
        return currentNode.textState;
        
        }
        else{
            return currentNode.textState;
        }
    }
    public void printCurrent() {
        System.out.println(currentNode.textState);
    }
    
}
