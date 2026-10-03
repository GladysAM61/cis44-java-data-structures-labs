/**
 *
 * @author gladysarias
 */
public interface stack<E>{
    //integer to store the size
    int size();
    //to show if its empty or not
    boolean isEmpty();
    //pushing the element
    void push(E element);
    //adding to the top
    E top();
    //popping an element
    E pop();
}
