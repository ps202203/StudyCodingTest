package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ11654_PrefixSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        int[] prefix = new int[N+1];

        prefix[0] = 0;

        for(int i = 1 ; i < N + 1 ; i++){
            prefix[i] += prefix[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(-prefix[Integer.parseInt(st.nextToken()) - 1] + prefix[Integer.parseInt(st.nextToken())]);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
