package programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/131130?language=java#
// 다른 사람의 풀이를 보고 작성한 코드입니다
import java.util.*;
public class SoloPlayingOthers {
    public static void main(String[] args) {
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
        Collections.sort(groups, Comparator.reverseOrder());
        System.out.println("정답은 : " + ((groups.size() == 1) ? 0 : groups.get(0) * groups.get(1)));
        System.out.println("result1 : " +groups.get(0));
        System.out.println("result2 : " +groups.get(1));
    }

}