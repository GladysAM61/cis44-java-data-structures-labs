/**
 *
 * @author gladysarias
 */
public class SortingAlgorithms {
    /**
     * Implements the Selection Sort algorithm.
     * Theoretical Complexity: O(n^2)
     */
    public static void selectionSort(int[] arr) {
        // TODO: Implement the Selection Sort algorithm.
        //making n be the length of the array
        int n = arr.length;
        //first for loop that goes through the array 
        for (int i = 0; i < n - 1; i++) {
            //storing the index of the minimum in min
            //we assume the first one is the minimum
            int min = i;
            
            // Find the smallest number by comparing them
            for (int j = i + 1; j < n; j++) {
                // if the current number is smaller then min, we store it in min
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            // Swap the new minimum with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Implements the Insertion Sort algorithm.
     * Theoretical Complexity: O(n^2) / Best-Case: O(n)
     */
    public static void insertionSort(int[] arr) {
        // TODO: Implement the Insertion Sort algorithm.
        //storing the length of the array in n
        int n = arr.length;
        //for loop to go through my array
        for (int i = 1; i < n; i++) {
            //store the current number in current
            int current = arr[i];
            //store the previous inex in prev
            int prev = i - 1;
            
            // Move elements greater than current one position ahead
            //basically swapping them if one is greater
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    /**
     * Implements the Merge Sort algorithm. Public-facing method.
     * Theoretical Complexity: O(n log n)
     */
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted
        }
        int[] temp = new int[arr.length];
        mergeSortRecursive(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortRecursive(int[] arr, int[] temp, int left, int right) {
        // TODO: Implement the recursive logic for Merge Sort.
     
        if (left < right) {
            
            //find the middle and split it there
            int mid = left + (right - left) / 2;
            
            // Sort the first and second halve
            mergeSortRecursive(arr, temp, left, mid);
            mergeSortRecursive(arr, temp, mid + 1, right);
            
            // combine them 
            merge(arr, temp, left, mid, right);
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // TODO: Implement the merge logic for Merge Sort.
        
        // Copy data to temp array
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;      // index of first half
        int j = mid + 1;   // index of second half
        int k = left;      // index of merged subarray

        // combine back into original array
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        // Copy remaining elements 
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
       
    }
    
}
