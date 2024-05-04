package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SelectionSort6 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException{
        int size = Integer.parseInt(br.readLine());
        int tmp_cnt = 0;
        int tmp;
        int i, j;

        int[] A = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(i = 0; i < size; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] B = new int[size];
        st = new StringTokenizer(br.readLine());
        for(i = 0; i < size; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }


        for(i = size -1 ; i > 1 ; i--){
            int max = A[i];
            tmp_cnt = i;
            for (j = 0; j < i; j++) {
                if (A[j] > max) {
                    max = A[j];
                    tmp_cnt = j;
                }
            }
            if(tmp_cnt != i) {
                tmp = A[i];
                A[i] = A[tmp_cnt];
                A[tmp_cnt] = tmp;
            }
            if(Arrays.equals(A,B)) {
                bw.write("1");
                break;
            }
        }

        if(i == 0) bw.write("0");

        bw.flush();
        bw.close();
        br.close();
    }
}
