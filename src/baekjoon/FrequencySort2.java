package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FrequencySort2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int frequency;
    int rank;

    public FrequencySort2(int frequency, int rank){
        this.frequency = frequency;
        this.rank = rank;
    }

    public static void main(String args[]) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int count = 0;
        int index;
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        int[] arr_frequency = new int[N];
        int[] arr_rank = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(Arrays.asList(arr2).indexOf(arr[i]) == -1){
                arr2[count] = arr[i];
                arr_frequency[count]++;
                arr_rank[count] = count;
                count++;
            }
            else{
                index = Arrays.asList(arr2).indexOf(arr[i]);
                arr_frequency[index]++;
            }
        }

        QuickSort(arr_frequency,0,N-1);



        bw.flush();
        bw.close();
        br.close();

    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[(left + right)/2];
        while (left <= right) {
            while (arr[left] < pivot) left ++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                swap (arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void QuickSort(int[] arr, int low,int high){
        int num = partition(arr, low, high);

        if (low < num - 1)
            QuickSort(arr, low, num - 1);

        if (num < high)
            QuickSort(arr, num, high);

    }

    public static void swap(int[]arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
