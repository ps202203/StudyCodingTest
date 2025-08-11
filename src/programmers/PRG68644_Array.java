package programmers;

import java.util.HashSet;
import java.util.Arrays;

public class PRG68644_Array {

    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length - 1 ;i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int[] result = solution(numbers);

        System.out.println(Arrays.toString(result));

    }
}
