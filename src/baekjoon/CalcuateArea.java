package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CalcuateArea {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] arr;
    static boolean[][] visit;
    static int [][] rect;
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static int count = 0;
    static int n, m;

    public static void main(String args[]) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int i,j,a;

        arr = new int[n][m];
        rect = new int[k][4];   //직사각형 좌표를 저장할 배열

        //입력
        for(i = 0; i < k ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(j = 0; j < 4; j++){
                rect[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //직사각형 구역을 입력
        //k개의 직사각형
        for(i = 0; i < k; i++){
            int x1 = rect[i][0];
            int y1 = rect[i][1];
            int x2 = rect[i][2];
            int y2 = rect[i][3];
            //직사각형 가로 길이만큼 반복
            for(j = x1; j < x2; j++){
                //직사각형 세로 길이만큼 반복
                for(a = y1; a < y2;a++){
                    if(arr[j][a] == 0) arr[j][a] = 1;
                }
            }
        }


        ArrayList<Integer> num = new ArrayList<>();

        //dfs
        for(i = 0; i < n ;i++){
            for(j = 0; j< m; j++){
                if(arr[i][j] == 0){
                    count = 1;
                    dfs(i,j);
                    num.add(count);
                }
            }
        }

        Collections.sort(num);
        //bw.write();

        bw.flush();
        bw.close();
        br.close();
    }
    public static void dfs(int x, int y){
        arr[x][y] = 1;

        for(int i =0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx >= 0 && nx < n && ny>= 0 && ny < m && arr[nx][ny] == 0){
                count++;
                dfs(nx,ny);
            }
        }
    }
}
