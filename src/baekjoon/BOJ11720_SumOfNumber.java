package baekjoon;

import java.io.*;
//https://www.acmicpc.net/problem/11720
public class BOJ11720_SumOfNumber {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(int i = 0 ; i < N ; i++){
            sum += Integer.parseInt(String.valueOf((str.charAt(i))));
            /*
            // charAt -> int
            char character=input.charAt(i);
            int charNum=(int)character-'0';
            *********************************
            // 문자열을 숫자형으로 변경
             sum += str.charAt(i) - '0';
             */
        }

        sb.append(sum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
