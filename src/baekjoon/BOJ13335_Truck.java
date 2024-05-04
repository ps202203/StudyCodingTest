package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ13335_Truck {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        int sum = 0;
        int temp;
        int result = 0;
        int count = 0;// 74ㅁㅁㅁ 5

        Deque<Integer> truck = new ArrayDeque<>();
        Deque<Integer> bridge = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine(), " ");

        //truck 큐에 집어 넣기
        for(int i = 0; i < n; i++){
            truck.offer(Integer.parseInt(st.nextToken()));
        }

        while(!truck.isEmpty()) {
            if (sum + truck.peek() <= L) {
                sum += truck.peek();
                bridge.add(truck.pop());
            } else {
                //앞에 있는 트럭 빼내기
                if(count == 0){
                    result += w - bridge.size() + 1;
                    count = 1;
                }else {
                    result += 1;
                }
                sum -= bridge.pop();
                count = 0;
            }

        }

        result -= n-2;




    }
}
