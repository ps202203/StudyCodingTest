package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1946_NewRecruits {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int N;
        int result;
        int[] rank;

        ArrayList<Integer> ranklist = new ArrayList<>();

        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());
            rank = new int[N];
            //배열에 신입사원 rank를 넣는다
            for(int j = 0 ; j < N; j++){
                st = new StringTokenizer(br.readLine(), " ");
                int temp = Integer.parseInt(st.nextToken());
                /*rank[temp] = Integer.parseInt(st.nextToken());*/
                ranklist.add(temp, Integer.parseInt(st.nextToken()));

            }
            /*List<int[]> list = Arrays.asList(rank);*/

            //인덱스 값이 더 작은 배열값에 더 작은 값이 존재하면 불가.
            result = N;
            for(int j = 0; j < N; j++){
                for(int k = 0 ; k < j; k++){
                    /*if(rank[k] < rank[j]){
                        result--;
                        break;
                    }*/
                    if(ranklist.get(k)<ranklist.get(j)){
                        result--;
                        break;
                    }
                }
                bw.write(result+"");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
