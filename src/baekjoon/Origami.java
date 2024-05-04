package baekjoon;

import java.io.*;

public class Origami {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        /*
        주어진 문자열이 가운데를 기준으로 0과1인지 확인하는 문제
        전부 다 쪼개서 확인

        size = 2^n - 1
        총 몇번 쪼개냐? = (size + 1) /2 - 1
        재귀? 반복?
        더해서 1이 되는 지 안되는 지?
        ** 앞 쪽만 합이 1인지 확인하면 됨.
        1001110 / 1000110
        100 / 110
        1/0

        전체 사이즈 = 2^n - 1
        인덱스 기준
        0 1 2 => 0,2
        0 1 2 3 4 5 6 => 012,456
        ...
        전체 사이즈 + 1 / 2까지

        기준은 [i / 2^(k+1) - 2 -i] => k은 1부터 1씩 n-1까지 증가
        i는 1부터 2^(n-1) - 1 까지, n은 1씩 증가

        너무 수학적인 접근같음.
        ?????????????????????????????

        0,1이 몇개있는지? 하나씩만 있으면 가능하지만 이건 불가

        */
        int num = Integer.parseInt(br.readLine());
        int size;


        for(int i = 0 ; i < num ; i++){

        }




    }
}
