/**
 *
 * @author gladysarias
 */
public class item {
    //creating the string of the item
    String name;
    
    //constructor
    public item(String name) {
        this.name=name;
        
    }
    
    //getter
    //returning the name of the item
    public String getName(){
        return name;
    }
    
    
     // return a String
    public String toString()
         {
        return String.format("%s",name);
      }
}
