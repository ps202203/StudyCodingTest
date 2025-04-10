package Sort;

import java.util.Arrays;

public class GY_BubbleSort {
    void bubbleSort(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {       // 1.
            for(int j= 1 ; j < arr.length-i; j++) { // 2.
                if(arr[j-1] > arr[j]) {             // 3.
                    // swap(arr[j-1], arr[j])
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        GY_BubbleSort g = new GY_BubbleSort();

    }
}
