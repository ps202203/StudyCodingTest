package baekjoon;

import java.io.*;

public class BOJ2018_SumOfNs5 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int start = 0, end = 0; //투 포인터 설정
        int sum = 0, cnt = 0;// sum : 합, cnt : 가지수

        while (start <= N){
            while(++end <= N){
                sum += end;
                if(sum>=N){
                    if(sum==N) cnt++;
                    break;
                }
            }
            while(++start<=N){  //start 증가
                sum -= start;   //부분합을 감소
                if(sum<=N){
                    if(sum == N) cnt++;
                    break;
                }
            }
        }
        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
