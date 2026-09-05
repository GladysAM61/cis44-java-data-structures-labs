//importing users input
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
       // create Scanner to obtain input from command window
       Scanner input = new Scanner(System.in);
       
       
       //telling the user to input their first number and storing theier answer in first num
       System.out.print("Please enter 1 to continue calculating or 2 to exit:");
       int num = input.nextInt();
       do{
       
       //telling the user to input their first number and storing theier answer in first num
       System.out.print("Enter your first number:");
       double firstNum = input.nextDouble();
       
//        telling the user to type the operator they want 
        System.out.print("Enter your desired operator:");
        String operator = input.next();

       
       //telling the user to type the second number and storing it in secondNum
       System.out.print("Enter your second number:");
       double secondNum = input.nextDouble();
       
       
    
      // answer is going to be a double where the answer will be kept
       
        double answer = 0;
        boolean validOperation = true;
        
        // if statements to compare the operator they want 
        //boolean to see if its valid or not
        if (operator.equals("+")) {
            answer = firstNum + secondNum;
        } else if (operator.equals("-")) {
            answer = firstNum - secondNum;
        } else if (operator.equals("*")) {
            answer = firstNum * secondNum;
        } else if (operator.equals("/")) {
            if (secondNum != 0) {
                answer = firstNum / secondNum;
            } else {
                System.out.println("Error: Division by zero.");
                validOperation = false;
            }
        } else {
            System.out.println("Invalid operator.");
            validOperation = false;
        }
        
        if (validOperation) {
            System.out.println(answer);
        }
        // Ask if they want to continue
            System.out.print("Please enter 1 to continue calculating or 2 to exit: ");
            num = input.nextInt();
       }while(num==1);
    }
}
