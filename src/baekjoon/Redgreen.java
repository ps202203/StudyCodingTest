package baekjoon;

import java.io.*;

public class Redgreen {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] arr;
    static boolean[][] visit;
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        char ch;
        int count = 0;
        int i = 0;
        int j = 0;

        arr = new int[n][n];
        visit = new boolean[n][n];

        //입력
        for(i = 0; i < n; i++){
            String input = br.readLine();
            for(j = 0; j < n; j++){
                ch =input.charAt(j);
                if(ch == 'B'){
                    arr[i][j] = 0;  //B의 경우 0을 저장
                } else if (ch == 'R') {
                    arr[i][j] = 1;  //R의 경우 1을 저장
                }else if (ch == 'G') {
                    arr[i][j] = 2;  //G의 경우 2을 저장
                } else break;
            }
        }

        //적록색약이 아닌 사람
        for(i = 0; i < n ;i++){
            for(j = 0; j< n; j++){
                if(!visit[i][j]){
                    dfs(i,j,n);
                    count++;
                }
            }
        }
        bw.write(count + "");
        count = 0;
        visit = new boolean[n][n];

        //R,G -> 하나의 값으로
        for(i = 0; i < n ;i++){
            for(j = 0; j< n; j++){
                if(arr[i][j] != 0)
                    arr[i][j] = 1;
            }
        }

        //적록색약인 사람
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                if(!visit[i][j]){
                    dfs(i,j,n);
                    count++;
                }
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y){

    }
    public static void dfs(int x, int y, int n){
        //방문 초기화
        visit[x][y] = true;
        for(int i =0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(0 > ny || ny >= n || 0 > nx || nx >= n )
                continue;
            if(arr[nx][ny] == arr[x][y])
                dfs(nx,ny,n);
            if(!visit[nx][ny])
                dfs(nx,ny,n);
        }
    }
}
