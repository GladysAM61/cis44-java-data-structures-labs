/**
 *
 * @author gladysarias
 */

public class mainMatrix {
    public static void main(String[] args) {
        //creating the first matrix
        //its going to have 4 rowns and 7 columns 
        matrix matrix1 = new matrix(4, 7);
        //using populateRandom() to fill in the rows and colomns with random numbers 1-10
        matrix1.populateRandom();
        
        //creating the second matrix
        //its going to have 4 rowns and 7 columns 
        matrix matrix2 = new matrix(4, 7);
        //using populateRandom() to fill in the rows and colomns with random numbers 1-10
        matrix2.populateRandom();
        
        //creating the third matrix that will be of a different size
        matrix matrix3 = new matrix(2,5);
        //using populateRandom() to fill in the rows and colomns with random numbers 1-10
        matrix3.populateRandom();
        
        //testing out the add by adding 1 and 2 together
        matrix total = matrix1.add(matrix2);
        System.out.println("Matrix 1 + Matrix 2:");
        System.out.println(total);
        
         //testing out the multiplication by multiplying 2 and 3 together
        try{matrix product = matrix2.multiply(matrix3);
        
        System.out.println("Matrix 2 + Matrix 3:");
        System.out.println(product);
        }catch(IllegalArgumentException e) {
             System.out.println("The number of columns in this matrix does not equal the number of rows in the other matrix.");
        
        }
        
       
        
    }
}
