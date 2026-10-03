/**
 *
 * @author gladysarias
 */
public class syntaxChecker {
    
    public static boolean isBalanced(String line) {
        // TODO: Implement this method using a Stack.
        //creates a new stack
        stack buffer = new arrayStack<>(line.length());

        // Your implementation here...
        
        //for loop to go through every item in stack
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            
            //first check if its an open symbol to push into the stack
            if (c == '(' || c == '{' || c == '[') {
                buffer.push(c);
            }
            
            //second check if its a closing symbol
            else if (c == ')' || c == '}' || c == ']') {
                if (buffer.isEmpty()) {
                    return false;
                }

                // Pop the top opening symbol off the stack
                char top = (Character) buffer.pop();

                // Check if the popped opener matches the current closer
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
            
        }
        return buffer.isEmpty(); // Placeholder
    }
    
    
     public static void main(String[] args) {
        String line1 = "public static void main(String[] args) { ... }"; // Should be true
        String line2 = "int x = (5 + [a * 2]);"; // Should be true
        String line3 = "System.out.println('Hello');)"; // Should be false (extra closing parenthesis)
        String line4 = "List list = new ArrayList<{String>();"; // Should be false (mismatched)
        String line5 = "if (x > 0) {"; // Should be false (unmatched opening brace)

        System.out.println("Line 1 is balanced: " + isBalanced(line1));
        System.out.println("Line 2 is balanced: " + isBalanced(line2));
        System.out.println("Line 3 is balanced: " + isBalanced(line3));
        System.out.println("Line 4 is balanced: " + isBalanced(line4));
        System.out.println("Line 5 is balanced: " + isBalanced(line5));
    }
    
}
