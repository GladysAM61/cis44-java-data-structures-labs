/**
 *
 * @author gladysarias
 */

import java.util.Arrays;
import java.util.Comparator;

public class AdvancedSorters {
    // --- MergeSort ---
    public static <K> void mergeSort(K[] S, Comparator comp) {
        int n = S.length;
        if (n < 2) return; // Base case

        // TODO: Divide
        int mid = n / 2;
        K[] S1 = Arrays.copyOfRange(S, 0, mid);
        K[] S2 = Arrays.copyOfRange(S, mid, n);

        // TODO: Conquer (recursive calls)
        mergeSort(S1, comp);
        mergeSort(S2, comp);

        // TODO: Combine
        merge(S, S1, S2, comp);
    }
    
    private static <K> void merge(K[] S, K[] S1, K[] S2, Comparator comp) {
        int i = 0, j = 0;
        // TODO: Implement the merge logic from the lecture
        // while S is not yet full
            while (i + j < S.length ) {
              // TODO: Copy remaining elements of S1 or S2
              // if S2 is empty OR (S1 is not empty AND S1[i] <= S2[j])
                if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) <= 0)) {
                    S[i + j] = S1[i++]; // Copy from S1
                } else {
                    S[i + j] = S2[j++]; // Copy from S1
                }
            }
    }
    
    
    
    // --- QuickSort ---
    public static <K> void quickSort(K[] S, Comparator comp) {
        quickSort(S, comp, 0, S.length - 1);
    }
    
    private static <K> void quickSort(K[] S, Comparator comp, int a, int b) {
        if (a >= b) return; // Base case

        // TODO: Divide
        int pivotIndex = partition(S, comp, a, b);

        // TODO: Conquer (recursive calls)
        quickSort(S, comp, a, pivotIndex - 1);
        quickSort(S, comp, pivotIndex + 1, b);
    }
    
    private static <K> int partition(K[] S, Comparator comp, int a, int b) {
        // TODO: Implement partition logic (e.g., Hoare's from lecture)
        
        // 1. Choose a pivot (e.g., S[a])
        K pivot = S[a]; 
        
        // 2. Set up 'left' and 'right' pointers
        int left = a + 1;
        int right = b;

        
         // 3. Loop and swap elements
        while (left <= right) {
            
            while (left <= right && comp.compare(S[left], pivot) < 0) {
                left++;
            }
            
            while (left <= right && comp.compare(S[right], pivot) > 0) {
                right--;
            }
            
            if (left < right) {
                swap(S, left, right);
                left++;
                right--;
            } else {
                break;
            }
        }

        // putting pivot into its final sorted position
        swap(S, a, right);
        return right;
       }
     
        //swapping elements
        private static <K> void swap(K[] S, int i, int j) {
            K temp = S[i];
            S[i] = S[j];
            S[j] = temp;
        }
       
       
}
