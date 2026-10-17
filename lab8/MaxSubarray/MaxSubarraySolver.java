/**
 *
 * @author gladysarias
 */
public class MaxSubarraySolver {
    /**
     * Finds the maximum subarray sum using a brute-force approach.
     * Theoretical Complexity: O(n^2)
     */
    public static int bruteForceMaxSum(int[] arr) {
        // TODO: Implement the O(n^2) brute-force algorithm.
        
        // Assume the first number is the max sum to start
        int maxSum = arr[0];
        
        // picking a starting position
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            // choosing an ending position and add numbers one by one
            for (int j = i; j < arr.length; j++) {
                currentSum = currentSum + arr[j];

                // If this subarray sum is larger than our best, then we save it
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        
        return maxSum; 
    }

    /**
     * Finds the maximum subarray sum using Kadane's Algorithm.
     * Theoretical Complexity: O(n)
     */
    public static int kadanesAlgorithmMaxSum(int[] arr) {
         // TODO: Implement the O(n) Kadane's Algorithm.
        

        // Initialize currentSum and maxSum with the first element
        int currentSum = arr[0];
        int maxSum = arr[0];
   
        // Looping through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            
            // If running total dropped below zero, leave it and start at 0
            if (currentSum < 0) {
                currentSum = 0;
            }

            // Add the current number to our running total
            currentSum = currentSum + arr[i];

            // If running total is bigger than the maximum, update maximum
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        return maxSum; // Placeholder
    }
}
