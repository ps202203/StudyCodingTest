package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/131130?language=java#
// 다른 사람의 풀이를 보고 작성한 코드입니다
public class SoloPlayingOthers {
    public static void main(String[] args) {

        /*
        ArralyList를 이용
        Comparator.reverseOrder() or Collections.reverseOrder를 이용
        [4,0,0,0,3,0,0,...] 인 배열을 정렬하여 답을 구함.
        1) 근데 1,2번째 상자그룹이외에 3번째 상자그룹의 숫자가 더 크다면?
        2) "임의의"인데, 랜덤성이 아닌 맨 처음부터 시작하는 코드라 정확힌 맞진 않은 것 같음.
         */

        int[] cards = {8, 6, 3, 7, 2, 5, 1, 4};
        int n = cards.length;
        boolean[] visited = new boolean[n];
        List<Integer> groups = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int now = i;
            int cnt = 0;
            while (!visited[now]) {
                cnt++;
                visited[now] = true;
                now = cards[now] - 1;
            }
            groups.add(cnt);
        }
        groups.sort(Comparator.reverseOrder());
        System.out.println("정답은 : " + ((groups.size() == 1) ? 0 : groups.get(0) * groups.get(1)));
        System.out.println("result1 : " + groups.get(0));
        System.out.println("result2 : " + groups.get(1));

    }
}