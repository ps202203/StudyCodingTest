package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class SnackDream {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Stack<Integer> arr = new Stack<>();

    public static void main(String args[]) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int target = 1;
        int num;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i< size; i++){
            num = Integer.parseInt(st.nextToken());
                if (arr.peek() == target) {
                    arr.pop();
                    target++;
                }
                if (num != target) {
                    arr.push(num);
                }
                if (arr.peek() == target) {
                    arr.pop();
                    target++;
                }
        }

        if(arr.empty()) System.out.println("Nice");
        else System.out.println("Sad");
    }
}
