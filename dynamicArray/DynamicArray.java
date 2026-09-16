/**
 *
 * @author gladysarias
 */
//importing ArrayList so I could use dynamic arrays
import java.util.ArrayList;

public class DynamicArray<T>{
    //array to store the elements
     private T[] data;
    //An integer to track the number of elements
    private int size;
    //An integer for the initial capacity 
    private static final int INITIAL_CAPACITY = 10;
    
    //A constructor that initializes the internal array with the initial capacity.
    public DynamicArray(){
        //a data array with objects of the initial capaity
        data = (T[]) new Object[INITIAL_CAPACITY];
        //starting the size at 0
        size = 0;
    }
    
    //this is going to add an element to the end of the array
    public void add(T element){
        //if the array is already full,call the resize method to make it bigger
        if(size==data.length){
            resize();
        }
            //basically size would be i for the array 
            //in the location size you plug in the element 
            data[size]= element;
            //increment the size since your moving into the next element 
            size++;
    }
    
    //this is going to make the array double the capacity
    private void resize(){
        //making a new array that is double the size
        T[] newData = (T[]) new Object[data.length*2];
        // going through the first array and getting the object to place it in the new array
        //basically copying and pasting it in the new array
        for(int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data = newData;
    }
    
    //Returns the element at the specified index.
    public T get(int index){
        //if the index is unvalid, meaning its larger than the size of the array, throw an indexoutof bounds exception 
        //it could also be unvalid if it is less than zero
        if(index>size||index<0){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
    
    //Removes the element at the specified index.
    public T remove(int index){
        //if statement to see if the index is valid, if its not then  
        if(index>size||index<0){
            throw new IndexOutOfBoundsException();
        }
        //storing the element that was removed
        T old =data[index];
        
        //for loop to move all the elements to the left
        for (int i = index; i < size - 1; i++) {
        //the data at i+1,or the right, moves to the previous spot
        data[i] = data[i + 1];
        }
        //decreasing the size
        size--;
        //making the last element empty 
        data[size] = null;
        
        //returning the element they removed
        return old;
    }
    
    public int size(){
        return size;
    }
    
}
