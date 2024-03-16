package baekjoon;

import java.io.*;

//https://www.acmicpc.net/problem/3986
//내 방식대로는 해결불가. stack으로 바꿔서 풀자.
public class GoodWord {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int result = 0;

        for (int num = 0; num < size; num++) {
            String target = br.readLine();
            //A나 B의 개수가 홀수인 경우
            if(isOdd(target, 'A')) continue;
            if(isOdd(target, 'B')) continue;


            //A사이에 B의 개수가 홀수인 경우, 좋은 글자가 아님. 나머지는 좋은 글자
            if (isNotGoodWord(target, 'A', 'B')) continue;
            result++;
            System.out.println("현재 result 값은 :" +result);
        }
        System.out.println(result);
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNotGoodWord(String str, char ch1, char ch2) {
        int cnt = 0;
        int result = 0;
        int i = 0;

        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) cnt++;
            if (cnt % 2 != 0 && str.charAt(i) == ch2){
                result++; break;
            }
        }
        cnt = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch2) cnt++;
            if (cnt % 2 != 0 && str.charAt(i) == ch1){
                result++; break;
            }
        }
        if(result == 2)return true;
        return false;

    }
    public static boolean isOdd(String str, char ch){

        int num = str.length() - str.replace(String.valueOf(ch), "").length();
        if(num % 2 != 0) return true;

        return  false;
    }
}
