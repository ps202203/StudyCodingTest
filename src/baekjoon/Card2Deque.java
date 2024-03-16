package baekjoon;

import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/3986
public class Card2Deque {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException{
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> card = new ArrayDeque<>(); //ArrayDeque 구현

        //N만큼 Queue에 쌓기
        for(int i = 1; i < n + 1; i++){
            card.offer(i);
        }

        //카드를 버리고 줍는 과정 수행
        while(card.size() != 1){
            card.poll();
            card.offer(card.poll());
        }

        System.out.println(card.peek());
        br.close();

    }
}