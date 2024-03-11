package programmers;

import java.util.Arrays;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class FruitMechantOthers {
    public static void main(String[] args){
        /*
        배열 내에서 해결한다는 아이디어는 같으나, 내 아이디어는 역순으로 배열해서 구하는 것이고,
        이 분들의 아이디어는 배열을 reverseOrder하지 않고, 자원을 덜 먹는 sort를 이용하고 for문을 역으로 이용했다.
        조금만 비틀면 더 효율적인 코드를 짤 수 있었는데 아쉬웠음.
         */

        int k = 4;
        int m = 3;
        int[] score = {4,1,2,2,4,4,4,4,1,2,4,2};
        int answer = 0;

        Arrays.sort(score); // score = {1,1,2,2,2,2,4,4,4,4,4,4};

        for(int i = score.length-m; i >= 0; i -= m) {
            answer += score[i] * m;
        }

        System.out.println(answer);
    }
}
