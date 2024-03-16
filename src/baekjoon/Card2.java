package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/3986
public class Card2 {
    static int N;
    static Queue<Integer> card = new LinkedList<>();


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //N만큼 Queue에 쌓기
        for(int i = 1; i <= N; i++){
            card.offer(i);
        }

        while(true){
            if(card.size() == 1) break;
            card.poll();
            card.offer(card.poll());
        }

        System.out.println(card.peek());
    }
}