/**
 *
 * @author gladysarias
 */
public class mainDynamic {
    public static void main(String[] args) {
    
    // Creating a DynamicArray full of Strings that are going to carry makeup brands
        DynamicArray<String> makeup = new DynamicArray<>();
        
        //adding strings to the array
        //im going to make an array full of makeup brands
         makeup.add("e.l.f. Cosmetics");
         makeup.add("Maybelline");
         makeup.add("Fenty Beauty");
         makeup.add("MAC Cosmetics");
         makeup.add("Charlotte Tilbury");
         makeup.add("Hourglass");
         makeup.add("HUDA BEAUTY");
         makeup.add("L'Oreal");
         
         
        //printing out the size of the array
        System.out.println("Size: " + makeup.size());
   
        System.out.println("");
        //printing out elements using get
        System.out.println("Makeup brand at index 3: " + makeup.get(3));
        System.out.println("Makeup brand at index 5: " + makeup.get(5));
        System.out.println("");
        //removing elements 
        String removed = makeup.remove(2);
        System.out.println("Removed: " + removed);
    System.out.println("");
        // Print the makeup brands
        System.out.println("Makeup Brands:");

        for (int i = 0; i < makeup.size(); i++) {
            System.out.println(makeup.get(i));
        }
        
        //adding elements to test the resize 
        
        while(makeup.size()<15){
            makeup.add("new brand");
        }
       
        System.out.println("");
         for (int i = 0; i < makeup.size(); i++) {
            System.out.println(makeup.get(i));
        }
        
       
    }
}
