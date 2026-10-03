/**
 *
 * @author gladysarias
 */
import java.util.EmptyStackException;

public class linkedQueue<E> implements queue<E>{
    //creating a Node
    private static class Node<E> {
    private E element;
    private Node<E> next;
    public Node(E e, Node<E> n) {
        element = e; next = n;
    }
    //getting an element
    public E getElement() { 
        return element; 
    }
    //getting the next element
    public Node<E> getNext() { 
        return next; 
    }
}
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    
    //getting the size
    public int size() { 
        return size; 
    }
    //checking if it is empty
    public boolean isEmpty() { 
        return size == 0;
    }
    public void enqueue(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) head = newest;
        else tail.next = newest;
        tail = newest;
        size++;
    }
    
    
    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }
    public E dequeue() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) tail = null;
        return answer;
    }
    

}
