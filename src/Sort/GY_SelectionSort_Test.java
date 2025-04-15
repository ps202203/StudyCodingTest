package Sort;
import java.util.Arrays;

public class GY_SelectionSort_Test {
    void selectionSort(int[] arr) {

        // selectionSort
        int indexMin, temp = 0;

        for(int i = 0; i < arr.length; i++){
            indexMin = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[indexMin]){
                    indexMin = j;
                }
            }
            if(indexMin != i){
                temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        GY_SelectionSort_Test sort = new GY_SelectionSort_Test();
        // 정렬할 배열 정의
        int[] arr = {5, 1, 4, 2, 8};

        // 정렬 수행
        sort.selectionSort(arr);

    }
}
