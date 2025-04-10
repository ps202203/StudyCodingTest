package Sort;

import java.util.Arrays;

public class GY_SelectionSort {
    void selectionSort(int[] arr) {
        int indexMin, temp;
        for (int i = 0; i < arr.length-1; i++) {        // 1.
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {  // 2.
                if (arr[j] < arr[indexMin]) {           // 3.
                    indexMin = j;
                }
            }
            // 4. swap(arr[indexMin], arr[i])
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        GY_SelectionSort sort = new GY_SelectionSort();
    }
}
