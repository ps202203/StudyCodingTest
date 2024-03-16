package baekjoon;

import java.io.*;
import java.util.Stack;

//https://www.acmicpc.net/problem/3986
public class GoodWord2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Stack<Character> stack = new Stack<>();

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            if(str.length() % 2 == 0)
                if(isGoodWord(str)) cnt++;
        }

        bw.write(""+cnt);
        bw.flush();
        bw.close();
        br.close();


    }

    public static boolean isGoodWord(String str){
        stack.add(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            if(stack.empty()){
                stack.push(str.charAt(i));
            } else if (!stack.empty() && stack.peek() == str.charAt(i)) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }
        if(stack.empty()) {
            return true;
        }
        stack.clear();
        return false;
    }
}
