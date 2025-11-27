// 코딩테스트합격자되기 자바편 문제 01
package Array;

import java.util.Arrays;

public class CHD01_sortarray {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5};
        int[] sorted = solution(arr);
        System.out.println(Arrays.toString(arr));   // [4, 2, 1, 3, 5]
        System.out.println(Arrays.toString(sorted));// [1, 2, 3, 4, 5]
    }
    private static int[] solution(int[] arr){
        int[] clone = arr.clone();  // clone = arr(); -> arr 주소를 가리키므로 arr도 같이 정렬된다.
        Arrays.sort(clone);
        return clone;
    }
}

/*
* java.util.Arrays 클래스의 sort() 메서드를 통해 정렬 가능
*
* 원본 배열의 상태를 유지하면서 원본 배열로부터 새로운 배열을 복사해서 사용해야 되는 상황에서는 clone() 메서드 사용
*
* Array.sort()의 시간복잡도는
*/