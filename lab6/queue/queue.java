/**
 *
 * @author gladysarias
 */
import java.util.EmptyStackException;

public interface queue<E> {
    //integer to store the size
   int size();
   //to check if its empty
   boolean isEmpty();
   void enqueue(E e);
   E first();
   E dequeue(); 
}
