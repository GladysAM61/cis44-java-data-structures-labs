/**
 *
 * @author gladysarias
 */
import java.util.Arrays;
import java.util.Random;

public class SortingTester {
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 25000, 50000, 100000};
        
        System.out.println("--- The Sorting Race ---");

        for (int n : sizes) {
            System.out.println("\n--- Testing for array size n = " + n + " ---");
            
            // TODO: Call your test methods for Average, Best, and Worst cases.
            // Call test methods for Average, Best, and Worst cases
            int[] randomData = generateRandomArray(n);
            int[] sortedData = generateSortedArray(n);
            int[] reverseData = generateReverseSortedArray(n);

            System.out.println("Average Case (Random):");
            runAndTimAllSorts(randomData);

            System.out.println("Best Case (Already Sorted):");
            runAndTimAllSorts(sortedData);

            System.out.println("Worst Case (Reverse Sorted):");
            runAndTimAllSorts(reverseData);
            
            
        }
    }
    
    // TODO: Implement the runAndTimAllSorts helper method.
    
    
    
    // Helper method to time all three sorts using nanoTime
    public static void runAndTimAllSorts(int[] original) {
        // Sort by selection
        //copy the original array
        int[] arr1 = original.clone();
        // Grab the starting time in nanoseconds
        long start1 = System.nanoTime();
        SortingAlgorithms.selectionSort(arr1);
        long end1 = System.nanoTime();
        System.out.println("  Selection Sort: " + (end1 - start1) / 1_000_000.0 + " ms");

        // 2.Sort by insertion 
        int[] arr2 = original.clone();
        long start2 = System.nanoTime();
        SortingAlgorithms.insertionSort(arr2);
        long end2 = System.nanoTime();
        System.out.println("  Insertion Sort: " + (end2 - start2) / 1_000_000.0 + " ms");

        // 3. Merge Sort
        int[] arr3 = original.clone();
        long start3 = System.nanoTime();
        SortingAlgorithms.mergeSort(arr3);
        long end3 = System.nanoTime();
        System.out.println("  Merge Sort:     " + (end3 - start3) / 1_000_000.0 + " ms");
    }
    
    
    

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    public static int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;//best case
        }
        return arr;
    }

    public static int[] generateReverseSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i; // Worst case
        }
        return arr;
    }
}
