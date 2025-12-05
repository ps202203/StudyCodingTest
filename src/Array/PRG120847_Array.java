package Array;

public class PRG120847_Array {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5};
        int result = 0;

        result = solution(numbers);

        System.out.println(result);
    }
    public static int solution(int[] numbers) {
        int max = 0;
        int max2 = 0;

        for(int i = 0 ; i < numbers.length; i++){
            if(max < numbers[i]){
                max2 = max;
                max = numbers[i];
            } else if (max2 < numbers[i] && max >= numbers[i]){
                max2 = numbers[i];
            }
        }

        return max * max2;
    }
}
