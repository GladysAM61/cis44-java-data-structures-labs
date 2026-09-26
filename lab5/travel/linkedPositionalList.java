/**
 *
 * @author gladysarias
 */
import java.util.Iterator;
import java.util.NoSuchElementException;


public class linkedPositionalList implements Iterable{
    // --- Nested Node Class (implements Position) ---
    private static class Node implements position {
        private String element;
        private Node prev;
        private Node next;
        
        //contructor
        public Node(String e, Node p, Node n) {
            element = e;
            prev = p;
            next = n;
        }
           //returning the element
          //throw an exception if there is no element
        public String getElement() {
            if (next == null)
                throw new IllegalStateException("Position no longer valid");
            return element;
        }
        //method to set the element
        public void setElement(String e) { 
            element = e;
        }
        //method to get the previous node
        public Node getPrev() { 
            return prev; 
        }
        //method to set the previous node
        public void setPrev(Node p) { 
            prev = p; 
        }
        //method to get the next node
        public Node getNext() {
            return next; 
        }
         //method to set the next node
        public void setNext(Node n) {
            next = n; 
        }

    }
    
    private Node header;
    private Node trailer;
    private int size = 0;

    public linkedPositionalList() {
        //constructor to create sentinel nodes 
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
        trailer.prev = header;
    }
    
    // ... Implement all the Positional List methods ...
    
    //first the size method
    public int size() { 
        return size;
    }
    //if its empty, then set the 
    public boolean isEmpty(){ 
        return size == 0;
    }
    
    //checking if its first
    public position first() {
        if (header.next == trailer){
            return null;
        }
        return header.next;
    }
    
    //returning the last node
    public position last() {
        if (trailer.prev == header){
            return null;
        }
        return trailer.prev;
    }
    
    
    //getting the one before 
    public position before(position p) {
        Node node = (Node) p;
        if (node.prev == header){ 
            return null;
        }
        return node.prev;
    }
    
    //getting the one after 
    public position after(position p) {
        Node node = (Node) p;
        if (node.next == trailer){
            return null;
        }
        return node.next;
    }
    
    //adding one between
    private position addBetween(String e, Node pred, Node succ) {
        Node newest = new Node(e, pred, succ);
        pred.next = newest;
        succ.prev = newest;
        size++;
        return newest;
    }
    
    //adding a first
    public position addFirst(String e) {
        return addBetween(e, header, header.next);
    } 
    
    //adding a last 
    public position addLast(String e) {
        return addBetween(e, trailer.prev, trailer);
    }
    
    //adding before
    public position addBefore(position p, String e) {
        Node node = (Node) p;
        return addBetween(e, node.prev, node);
    }

    //adding after
    public position addAfter(position p, String e) {
        Node node = (Node) p;
        return addBetween(e, node, node.next);
    }
    
    //setting 
    public position set(position p, String e) {
        Node node = (Node) p;
        node.element = e;
        return node;
    }
    
    //removing a node
    public String remove(position p) {
        //current node
        Node node = (Node) p;
        //the previous node
        Node pred = node.prev;
        //the next node
        Node succ = node.next;
        pred.next = succ;
        succ.prev = pred;
        //decrement the size 
        size--;
        return node.element;
    }
    
    
    // nested Iterator Class
    private class ElementIterator implements Iterator {
        position cursor = first(); // Start at the first element
        
        public boolean hasNext() {
            return cursor != null;
        }
        
       public String next() {
           //If there are no more items left, crash safely with an error
            if (!hasNext()) throw new NoSuchElementException();
            //Grab the string value out of the current position where our cursor is looking
            String item = cursor.getElement();
            cursor = after(cursor);
            return item;
        }
    }
    
    @Override
    public Iterator iterator() {
        return new ElementIterator();
    }
}
