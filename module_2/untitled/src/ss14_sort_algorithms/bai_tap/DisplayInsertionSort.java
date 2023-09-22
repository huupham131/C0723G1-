package ss14_sort_algorithms.bai_tap;

import java.util.Arrays;

public class DisplayInsertionSort {
    public static void main(String[] args) {
        int[] numbersArray = {7, -2, 4, 8, 4, 2};
        int n = numbersArray.length;
        int key;
        for (int i = 1; i < n; ++i) {
            key = numbersArray[i];
            int j = i - 1;
            while (j >= 0 && numbersArray[j] > key) {
                numbersArray[j + 1] = numbersArray[j];
                j = j - 1;
            }
            numbersArray[j + 1] = key;
            System.out.println("Change value at index "+(j+1) + " to " +key  );
            System.out.println("After the loop " + i);
            System.out.println("The result "+ Arrays.toString(numbersArray));
        }
    }
}
