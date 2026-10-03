/**
 *
 * @author gladysarias
 */
import java.util.EmptyStackException;

public class linkedQueue<E> implements queue<E>{
    private static class Node<E> {
    private E element;
    private Node<E> next;
    public Node(E e, Node<E> n) {
        element = e; next = n;
    }
    public E getElement() { 
        return element; 
    }
    public Node<E> getNext() { 
        return next; 
    }
}
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public int size() { 
        return size; 
    }
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
