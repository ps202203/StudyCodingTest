package Array;

import java.util.Arrays;

public class CHD05_12949 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};
        solution(arr1,arr2);
    }
    public static void solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < arr1.length; i++){
            for(int k = 0 ; k < arr2[0].length;k++){
                for(int j = 0 ; j < arr2.length; j++){
                    answer[i][k] += arr1[i][j]*arr2[j][k];
                }
            }
        }
        System.out.println(Arrays.deepToString(answer));
    }

}

/*
*
* https://school.programmers.co.kr/learn/courses/30/lessons/12949
*
* */