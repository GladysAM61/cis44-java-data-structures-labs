/**
 *
 * @author gladysarias
 */
//importing all the things we need
import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.List; 

public class inventory {
    //where we will store the users items 
    private List<item> items; 
    //constructor
    public inventory() { 
        this.items = new ArrayList<>(); 
    }
    
    //how we will add items to the list 
     public void addItem(item item){
         this.items.add(item);
     }
    
     //how we will display all the items 
     public void display(){
         //for loop to display each item
         //however,first we check to see if the list is empty
         System.out.println("\n Items on list:");
         // if its empty, print out the list is empty
         //else print the item on the list
        if (items.isEmpty()) {
          System.out.println("The list is empty.");
        } else {
            for (item Item : items) {
                System.out.println("* " + Item);
//                System.out.println("\n");
            }
        }
         
     } 
  
     public void combineItems(String name1, String name2) { 
           boolean found1 = false; 
           boolean found2 = false; 
           //new iterator
           Iterator<item> iter = items.iterator(); 
           while (iter.hasNext()) { 
                 item current = iter.next(); 
            
              if (!found1 && current.getName().equals(name1)) {
                  //tracking the item that we found
                found1 = true;
                //removing it
                iter.remove();
            } else if (!found2 && current.getName().equals(name2)) {
                //tracking the item that we found
                found2 = true;
                //removing it
                iter.remove();
            }      
        }
        //if they are both found then we add the combined item
        if (found1 && found2) {
          items.add(new item("Magic Staff"));
         }
    } 
      
     
}
