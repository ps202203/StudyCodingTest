package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/11004
public class KthNum11004 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++){
           arr[i] = Integer.parseInt(st.nextToken());
        }

        QuickSort(arr,0,N-1);
        bw.write(arr[K-1] + "");

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

//분할,정복,결합으로 이루어진 퀵정렬 구현
