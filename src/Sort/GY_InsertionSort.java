package Sort;

import java.util.Arrays;

public class GY_InsertionSort {
    void insertionSort(int[] arr)
    {
        for(int index = 1 ; index < arr.length ; index++){ // 1.
            int temp = arr[index];
            int prev = index - 1;
            while( (prev >= 0) && (arr[prev] > temp) ) {    // 2.
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;                           // 3.
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        GY_InsertionSort sort = new GY_InsertionSort();
        // 정렬할 배열 정의
        int[] arr = {5, 1, 4, 2, 8};

        // 정렬 수행
        sort.insertionSort(arr);
    }
}
