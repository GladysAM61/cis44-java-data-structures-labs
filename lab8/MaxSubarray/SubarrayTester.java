
/**
 *
 * @author gladysarias
 */

import java.util.Random;

public class SubarrayTester {
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 50000, 100000};
        
        System.out.println("--- Maximum Subarray Sum Algorithm Comparison ---");

        for (int n : sizes) {
            System.out.println("\n--- Testing for array size n = " + n + " ---");
            
            // TODO: Generate a random array and time both algorithms.
            
            
            //generate random array
            int[] data = generateRandomArrayWithNegatives(n);
            //time both algorithms
            runAndTimedSubarraySorts(data);
        }
    }

    // Timing method
    public static void runAndTimedSubarraySorts(int[] original) {
        
        // Brute Force
        int[] arr1 = original.clone();
        long start1 = System.nanoTime();
        int resultBrute = MaxSubarraySolver.bruteForceMaxSum(arr1);
        long end1 = System.nanoTime();
        double timeBrute = (end1 - start1) / 1_000_000.0;

        // Kadane's Algorithm 
        int[] arr2 = original.clone();
        long start2 = System.nanoTime();
        int resultKadane = MaxSubarraySolver.kadanesAlgorithmMaxSum(arr2);
        long end2 = System.nanoTime();
        double timeKadane = (end2 - start2) / 1_000_000.0;

        // Print times in milliseconds
        System.out.println("  Brute-Force O(n^2): " + timeBrute + " ms (Result: " + resultBrute + ")");
        System.out.println("  Kadane's    O(n):   " + timeKadane + " ms (Result: " + resultKadane + ")");
    }
    
    
    
    
    public static int[] generateRandomArrayWithNegatives(int size) {
        // Implementation provided in previous response
        Random rand = new Random();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1001) - 500; 
        }
        
        return arr;
    }
}
