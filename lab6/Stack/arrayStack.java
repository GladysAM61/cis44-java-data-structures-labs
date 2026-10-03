/**
 *
 * @author gladysarias
 */
import java.util.EmptyStackException;
public class arrayStack<E> implements stack<E>{
    //array of data
    private Object[] data;
    //keep track of the stack and starting it as empty
    private int t = -1;
    //making the capacity 100
    //can't go past 100
    private static final int DEFAULT_CAPACITY = 100;
    
    //making a stack with this stack
    public arrayStack() {
    this(DEFAULT_CAPACITY);
    }
    
    //constructor 
    public arrayStack(int capacity) {
    data = new Object[capacity];
    }
    
    
    //returns the size
    @Override
    public int size() {
    return (t + 1);
    }
    
    //checking the stack to check if its empty
    @Override
    public boolean isEmpty() {
    return (t == -1);
    }
    
    //adding a new element to the top of the stack 
    @Override
    public void push(E element) throws IllegalStateException {
         if (size() == data.length) {
             throw new IllegalStateException("Stack is full");
            }
        t++;
        data[t] = element;
    }
    
    
    //checks the item at the top of the stack without removing it 
    @Override
    @SuppressWarnings("unchecked")
    public E top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (E) data[t];
    }

    //checks the item on the top and returns and removes it
    @Override
    @SuppressWarnings("unchecked")
    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E answer = (E) data[t];
        data[t] = null; 
        t--;
        return answer;
    }
    
}
