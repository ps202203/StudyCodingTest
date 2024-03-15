package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GoodWord {
    static int size;
    static String str;

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int result = 0;
        int count = 0;

        for(int num = 0; num < size; num++){
            Scanner string = new Scanner(System.in);

            //A나 B의 개수가 홀수인 경우


            //A사이에 B의 개수가 홀수인 경우, 좋은 글자가 아님. 나머지는 좋은 글자
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'B') count++;
                if(count % 2 != 0 && str.charAt(i) == 'A') continue;
                result++;
            }


        }
    }
}
