package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class hw1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        // 정수 배열 int[] arr에서 짝수만 골라서 ArrayList<Integer>에 넣고
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                list.add(arr[i]);
            }
        }

        //그걸 다시 int[]로 바꾸는 코드 한번 직접 짜보기
        int [] result = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        System.out.println(Arrays.toString(result));


    }
}

/*
정수 배열 int[] arr에서 짝수만 골라서 ArrayList<Integer>에 넣고
그걸 다시 int[]로 바꾸는 코드 한번 직접 짜보기
 */