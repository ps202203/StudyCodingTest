package Array;

public class PRG120585_Array {
    public static void main(String[] args) {
        int[] array ={149, 180, 192, 170};
        int height = 167;
        int result = 0;

        for(int temp : array){
            if(temp > height){
                result++;
            }
        }


        System.out.println(result);
    }
}
