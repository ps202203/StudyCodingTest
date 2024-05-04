package baekjoon;

import java.io.*;
/*
    ㅁㅁ/ㅁ/ㅁㅁ
    palindrome 조건
    1. 홀수개의 알파벳은 0,1
    2.  0 -> 다 가능. 사전순으로 배열 짝+짝+ㅁ = 짝
        1 -> 알파벳은 무조건 가운데. 사전순으로 배열 홀+짝+짝+ㅁ = 홀
 */

public class BOJ1213_MakePalindrome {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String input = br.readLine();

        int[] num_alphabet = new int[26];
        int count = 0;
        int center = 0;
        int tmp = 1;


        //각 알파벳의 개수 구하기
        for(int i = 0; i < input.length(); i++){
            num_alphabet[input.charAt(i) - 'A']++;
        }

        for(int i = 0; i < 26 ; i++){
            //홀수개의 알파벳 구하기
            if(num_alphabet[i] % 2 != 0){
                count++;
                center = i;
            }
            //홀수개의 알파벳이 2개 이상이거나 짝수문자열 중 홀수개가 있을 경우
            if(count > 1 || (count == 1 && input.length() % 2 == 0)){
                bw.write("I'm Sorry Hansoo");
                tmp = 0;
                break;
            }
        }

        //print
        if(tmp == 1) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < num_alphabet[i] / 2; j++) {
                    bw.write(i + 'A');
                }
            }
            //홀수개 일경우
            if (count == 1) bw.write(center + 'A');

            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < num_alphabet[25 - i] / 2; j++) {
                    bw.write(25 - i + 'A');
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}