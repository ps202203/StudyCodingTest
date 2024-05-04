package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/1546
public class BOJ1546_Mean {
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        double sum = 0;
        int[] array = new int[N];
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ;i < N ; i++){
            array[i] = Integer.parseInt(st.nextToken());
            sum += array[i];
            //if(array[i] > max) max = array[i];
            max = Math.max(max, array[i]);
        }

        sum = sum * 100 / max / N;
        sb.append(sum);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
