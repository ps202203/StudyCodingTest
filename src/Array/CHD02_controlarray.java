// 코딩테스트합격자되기 자바편 문제 01
package Array;

import java.util.Arrays;
import java.util.Comparator;

public class CHD02_controlarray {
    private static int[] solution(int[] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Comparator.reverseOrder());
        // int형 배열로 변경 후 반환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 3, 4};
        int[] sorted = solution(arr);
        System.out.println(Arrays.toString(sorted));
        }

}