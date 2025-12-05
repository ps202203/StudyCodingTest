package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PRG120821_Array {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        int[] result = solution(num_list);
        System.out.println(Arrays.toString(result));
    }
    public static int[] solution(int[] num_list) {
        return IntStream.range(0, num_list.length)
                .map(i -> num_list[num_list.length - 1 - i])
                .toArray();
    }
}