package Sort;

import java.util.Arrays;

public class GY_BubbleSort {

    // 버블 정렬 메서드
    void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {             // 앞의 값이 더 크면 교환
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("정렬 결과: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        GY_BubbleSort g = new GY_BubbleSort();

        // 정렬할 배열 정의
        int[] arr = {5, 1, 4, 2, 8};

        // 정렬 수행
        g.bubbleSort(arr);
    }
}
