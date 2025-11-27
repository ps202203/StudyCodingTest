// 코딩테스트합격자되기 자바편 문제 04
package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CHD04_42840 {
    private static int[] solution(int[] answers){
        int a1 = 0, a2 = 0, a3 = 0;

        // 수포자들의 패턴
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};

        // 수포자들이 값을 얼마나 맞췄는지 확인
        for(int i = 0; i < answers.length ; i ++){
            if(p1[i % 5] == answers[i]) a1++;
            if(p2[i % 8] == answers[i]) a2++;
            if(p3[i % 10] == answers[i]) a3++;
        }
        int[] scores = {a1, a2, a3};
        int maxScore = Arrays.stream(scores).max().getAsInt();

        // return 값 작성
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i < scores.length; i++) {
            if(scores[i] == maxScore){
                answer.add(i+1);
            }
        }

        int[] result = new int[answer.size()];
        for(int i = 0 ;i < answer.size();i++){
            result[i] = answer.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,2};
        int[] result = solution(arr);
        System.out.println(Arrays.toString(result));
    }
}

/*
*
* https://school.programmers.co.kr/learn/courses/30/lessons/42840
*
* */