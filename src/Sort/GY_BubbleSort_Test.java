package Sort;

import java.util.Arrays;

public class GY_BubbleSort_Test {

    // 버블 정렬 메서드
    void bubbleSort(int[] arr) {
        int temp = 0;


        // Bubble Sort

        System.out.println("정렬 결과: " + Arrays.toString(arr));
    }


    public static void main(String[] args) {
        GY_BubbleSort_Test sort = new GY_BubbleSort_Test();

        // 정렬할 배열 정의
        int[] arr = {5, 1, 4, 2, 8};

        // 정렬 수행
        sort.bubbleSort(arr);
    }
}
