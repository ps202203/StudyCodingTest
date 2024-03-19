package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q11286 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int result = 0;

        //우선순위 큐를 2개 만든다. (음수인 경우, 양수인 경우)
        //음수인 경우 -> 절댓값이 작을수록 크니까 높은 숫자 우선인 큐
        //양수인 경우 -> 절댓값이 작을수록 작으니까 낮은 숫자가 우선 순위인 큐

        //(정수가 양수) 낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueuePlus = new PriorityQueue<>();

        //(정수가 음수) 높은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueMinus = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < size; i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp < 0) {
                priorityQueueMinus.add(tmp);
            }
            else if(tmp > 0) {
                priorityQueuePlus.add(tmp);
            }
            else if (tmp == 0) {
                if(!priorityQueuePlus.isEmpty()||!priorityQueueMinus.isEmpty()) {
                    if (!priorityQueueMinus.isEmpty() && !priorityQueuePlus.isEmpty()) {
                        if (Math.abs(priorityQueueMinus.peek()) > Math.abs(priorityQueuePlus.peek()))
                            result = priorityQueuePlus.poll();
                        else result = priorityQueueMinus.poll();
                    } else if (priorityQueuePlus.isEmpty()) {
                        result = priorityQueueMinus.poll();
                    } else if (priorityQueueMinus.isEmpty()) {
                        result = priorityQueuePlus.poll();
                    }
                }
                else result = 0;
                System.out.println(result);
            }
        }
    }
}
