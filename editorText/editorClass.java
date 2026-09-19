//importing the scanner
import java.util.Scanner;

public class editorClass {
    public static void main(String[] args) {
        //  Create a new editor
        textEditor newText = new textEditor();
        //creating a new scanner
        Scanner scanner = new Scanner(System.in);
        //to determine if they are done
        int done=0;
        
       //repeating while the user doesn't exit
       while (done != 5) {
           System.out.println("Please pick what you would like to do: ");
           System.out.println("1. Add a text");
           System.out.println("2. Undo a text");
           System.out.println("3. Redo a text");
           System.out.println("4. Print the current text");
           System.out.println("5. Exit");
           System.out.print("Choose an option (1-5): ");
           
           //storing their choice in done
                done = scanner.nextInt();
                scanner.nextLine();
           
        if(done == 1){
            //prompting the user to add their text
            System.out.print("Please enter your text: ");
            String text = scanner.nextLine();
            newText.add(text);
        }
        if(done == 2){
            //undo
            newText.undo();
            
        }   
        if(done == 3){
            //redo
            newText.redo();

        }
        if(done == 4){
            //printing the current text
            
            newText.printCurrent();
        }
        if(done == 5){
            //closing the scanner
            scanner.close();
        }
       }
    }
}
    
