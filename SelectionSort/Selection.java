package SelectionSort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        System.out.println("Before Sorting : ");
        int[] arr = { 86, 15, 84, 93, 73, 97, 69, 2 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Sorting :");
        System.out.println(Arrays.toString(arr));
    }
}