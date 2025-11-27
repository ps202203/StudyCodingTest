// 코딩테스트합격자되기 자바편 문제 03
package Array;

import java.util.Arrays;
import java.util.HashSet;

public class CHD03_68644 {
    private static int[] solution(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                set.add(arr[i]+arr[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 3, 4};
        int[] added = solution(arr);
        System.out.println(Arrays.toString(added));

    }
}

/*
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 */