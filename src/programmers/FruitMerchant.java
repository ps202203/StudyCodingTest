package programmers;

import java.util.Arrays;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808
public class FruitMerchant {
    public static void main(String[] args){
        int k = 4;
        int m = 3;
        int[] score = {4,1,2,2,4,4,4,4,1,2,4,2};

        int answer;
        int p = 0;
        int numOfBoxes = score.length / m;

        if(score.length < m) answer = 0;
        else {
            Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
            Arrays.sort(tmp, Collections.reverseOrder());

            for (int i = 1; i <= numOfBoxes; i++) {
                p += tmp[i * m - 1];
            }
            answer = m * p;
        }
        System.out.println(answer);
    }
}



