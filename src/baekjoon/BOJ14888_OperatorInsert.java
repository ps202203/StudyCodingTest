package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ14888_OperatorInsert {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public int plus(int a, int b){
        return a+b;
    }
    public int minus(int a, int b){
        return a-b;
    }
    public int multiple(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a / b;
    }
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");
        int plus = Integer.parseInt(st.nextToken());
        int minus = Integer.parseInt(st.nextToken());
        int multiple = Integer.parseInt(st.nextToken());
        int divide = Integer.parseInt(st.nextToken());

        //순서를 어떻게 정해야할까 탐색?
        //N! / a!b!c!d!
        //전체를 탐색하는 방법 -> 정렬에서 최악의 경우?
        //N-1개의 숫자를 정렬할 때, 최악의 경우 A1 ~ An-1 <- +++---***/// 순서대로 놔두고 집어넣기

        //최악의 경우 숫자배열 생성
        int[] cont = new int[N-1];
        for(int i = 0; i < N-1; i++){
            cont[i] = N - i;
        }

        //순열 -> O(n!)







    }
}