import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        System.out.println("Before Sorting :");
        int[] arr = { 86, 15, 84, 93, 73, 97, 69, 2 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int temp;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
