/**
 *
 * @author gladysarias
 */
import java.util.Random; 

public class river {
    static Random random = new Random();

    public static void main(String[] args) {

        // Create the river that is an array that gives 20 spaces 
        animal[] river = new animal[20];

        // Placing the animals where we want them by placing them in the index
        river[0] = new bear();
        river[3] = new fish();
        river[6] = new bear();
        river[9] = new bear();
        river[11] = new fish();
        river[14] = new fish();
        river[19] = new bear();
        
        //for loop to repeat the code or game running for 15 times
        for (int step = 1; step <= 15; step++) {

            moveAnimals(river);

            System.out.println("Step " + step + ":");
            printRiver(river);
            System.out.println();
        }   
        
    }
    
    //this is what moves all the animals
    
    public static void moveAnimals(animal[] river) {
        //if the animal is less then the length of the river compare if there is an aminal there
        //if the index[i](the animal) is empty then you continue
        //if it is not empty you run into an animal
          for (int i = 0; i < river.length; i++) {
           if (river[i] == null) {
                continue;
            }
           //this is how the bear and fish will move from left and right 
          
            int move = random.nextInt(3) - 1;

            int newPosition = i + move;

           //this makes them stay at indexes less then 20 
           //in other words they won't leave the river
            if (newPosition < 0 || newPosition >= river.length) {
                continue;
            }

            //the index is their new spot which will be used to compare if its empty or not
            if (newPosition == i) {
                continue;
            }

            // if the idex of the river is empty, then there is no animal there
            if (river[newPosition] == null) {
                river[newPosition] = river[i];
                river[i] = null;

            } else {

                // if it is not null there is an animal already there
                meet(river, i, newPosition);
            }

              
          }
    }
    
    // this controls if the animals get eaten or make a baby
    public static void meet(animal[] river, int oldPosition, int newPosition) {

        animal animal1 = river[oldPosition];
        animal animal2 = river[newPosition];

        // if they are both bears then they have a baby
        if (animal1 instanceof bear && animal2 instanceof bear) {

            addBaby(river, new bear());
        }

        // if they are both fish, then they have a baby 
        else if (animal1 instanceof fish && animal2 instanceof fish) {

            addBaby(river, new fish());
        }

        // if its bear and fish then the bear eats the fish
        else if (animal1 instanceof bear && animal2 instanceof fish) {

            // Fish gets eaten
            river[newPosition] = animal1;
            river[oldPosition] = null;
        }

        // if its a fish and a bear, the fish gets eaten
        else if (animal1 instanceof fish && animal2 instanceof bear) {
            river[oldPosition] = null;
        }
        
    }    
         // Adds a baby to a random empty spot
    public static void addBaby(animal[] river, animal baby) {
        while (true) {
            int position = random.nextInt(river.length);
            if (river[position] == null) {
                river[position] = baby;
                break;
            }
        }
    }

    // this prints out the river
    public static void printRiver(animal[] river) {
        for (int i = 0; i < river.length; i++) {
//if the river is empty, then it print out - , however if an animal is there then it prints out a symbol
//f for fish and b for bear
            if (river[i] == null) {
                System.out.print("-");
            } else {
                System.out.print(river[i].getSymbol());
            }
        }

        System.out.println();
    }
        
    
 
  
}
