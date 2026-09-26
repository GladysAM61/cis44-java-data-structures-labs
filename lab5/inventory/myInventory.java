/**
 *
 * @author gladysarias
 */
//importing the scanner
import java.util.Scanner;

public class myInventory {
     public static void main(String[] args) {
         //creating a new inventory
         inventory newInventory = new inventory();
         //creating a new scanner
        Scanner scanner = new Scanner(System.in);
         //choice to keep track
         int choice = 0;
         //as long as they dont want to end the program,keep on running it
         while(choice!=4){
             //prompting the user what they would like to do
            System.out.print("Hello! What would you like to do?");

              
           System.out.println("\n1. Add an item");
           System.out.println("2. Display your items");
           System.out.println("3. Combine your items");
           System.out.println("4. Exit");
           System.out.println("Choose an option (1-4): ");
               //storing their choice in choice
                choice = scanner.nextInt();
                scanner.nextLine();
          
             //if they want to add an item
            if(choice==1){
               System.out.print("Enter your item: ");
               String firstItem = scanner.nextLine();
               newInventory.addItem(new item(firstItem));
            }
            //if they want to display the inventory:
            if(choice==2){
                newInventory.display();
            }
            //if they want to combine
            if(choice==3){
                System.out.print("First item: ");
                String name1 = scanner.nextLine();

                System.out.print("Second item: ");
                String name2 = scanner.nextLine();
                
                newInventory.combineItems(name1, name2);
            }
            if(choice == 4){
                  scanner.close();
            }
         }
     }
}
