package SelectionSort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] array = { 86, 15, 84, 93, 73, 97, 69, 2 };
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
