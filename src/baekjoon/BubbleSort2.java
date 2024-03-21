package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BubbleSort2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 전체 크기
        int K = Integer.parseInt(st.nextToken()); // 교환 횟수
        int count = 0;
        int tmp;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = N-1; i > 0; i--){
            for(int j = 0; j < i && count < K ;j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    count++;
                }
            }
        }
        if(count < K) System.out.println("-1");
        else {
            for(int i = 0; i < N; i++)
                System.out.print(arr[i]+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
