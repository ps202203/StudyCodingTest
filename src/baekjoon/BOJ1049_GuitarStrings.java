package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ1049_GuitarStrings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int package_min = -1;
        int each_min = -1;
        int temp_package;
        int temp_each;
        int result;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            if (package_min == -1) { //초기화
                package_min = Integer.parseInt(st.nextToken());
                each_min = Integer.parseInt(st.nextToken());
            } else {
                temp_package = Integer.parseInt(st.nextToken());
                temp_each = Integer.parseInt(st.nextToken());

                //최소값 구하기
                if (temp_package < package_min) {
                    package_min = temp_package;
                }
                if (temp_each < each_min) {
                    each_min = temp_each;
                }
            }
        }

        //만약 6개 세트가 낱개 * 6보다 비쌀경우
        if(package_min >= 6 * each_min){
            result = N * each_min;
        }//6개 세트가 낱개보다 쌀 경우
        else if(package_min < each_min){
            if(N % 6 == 0) result = package_min *(N / 6);
            else result = package_min *(N / 6 + 1);
        } else if (each_min * (N % 6) >= package_min) {
            if(N % 6 == 0) result = package_min *(N / 6);
            else result = package_min *(N / 6 + 1);
        } else {
            result = package_min * (N / 6) + each_min * (N % 6);
        }

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
