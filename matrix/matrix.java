/**
 *
 * @author gladysarias
 */
//importing random so we can use the random numbers
import java.util.Random;

public class matrix {
    // a private instance variable:
    private int[][] data;
    //Constructor that initializes the matrix with the given dimensions.
    //it gives rows and colums
    public matrix(int rows, int cols){
        data = new int[rows][cols];
    }
    //Constructor that initializes the matrix with a pre-existing 2D array.
    public matrix(int[][] data){
        this.data=data;
    }
    
    //Fills the matrix with random integer values between 1 and 10.
    public void populateRandom(){
        Random random = new Random();
       //double for loop since its a 2D array
       //first for loop is for the row and the second is for the column
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(10) + 1;
            }
        }
    }
    
    //
    public matrix add(matrix other){
        //creating a boolean to help determine if theyre the same
       boolean same;
       //if the length is the same then the same boolean is true and then we will add them together
       if(data.length==other.data.length && data[0].length == other.data[0].length){
           same=true;
       }else{
           //if its false, then we throw the IllegalArgumentException
           throw new IllegalArgumentException();
       }
       
       //making a new matrix array
       //data.length=numbers of rows
       //data[0].length=number of columns
       matrix added = new matrix(data.length, data[0].length);
      
       if(same==true){
           //double for loop
          for(int i=0;i<data.length;i++){
              for(int j=0;j<data[i].length;j++){
                  //storing the answer in the new array
                  added.data[i][j]=data[i][j]+other.data[i][j];
              }
          }
       }
       
       //return the new array
       return added; 
    }
    
    //Multiplies this matrix by another matrix
    //the same as added but instead of adding it multiplies
    //I will be reusing the add code
    public matrix multiply(matrix other){
        //creating a boolean to help determine if theyre the same
       boolean same;
       //if the length is the same then the same boolean is true and then we will add them together
       if(data[0].length==other.data.length){
           same=true;
       }else{
           //if its false, then we throw the IllegalArgumentException
           throw new IllegalArgumentException();
       }
       
       //making a new matrix array
       //data.length=numbers of rows
       //data[0].length=number of columns
       matrix multiplied = new matrix(data.length, other.data[0].length);
      
       if(same==true){
           //triple for loop
          for(int i=0;i<data.length;i++){
              for(int j=0;j<other.data[0].length;j++){
                  for (int k = 0; k < data[0].length; k++) {
                    multiplied.data[i][j] += data[i][k] * other.data[k][j];
                  }
              }
          }
       }
       
       //return the new array
       return multiplied; 
    }
    
    //Returns a string representation of the matrix, formatted in rows and columns.
    @Override
    public String toString(){
        //start with an empty string thats going to print the matrix
         String print = "";
         //double for loop
         //first for loop goes through the rows
        for (int i = 0; i < data.length; i++) {
            //this loop goes through the columns 
            for (int j = 0; j < data[i].length; j++) {
                //printing out the element in that row and column and giving it "" so theres space between 
                print += data[i][j] + " ";
            }
       //moving on to hte next row and printing it sepreatly 
            print += "\n";
        }
        //print the whole matrix
        return print;
    }
    
}
