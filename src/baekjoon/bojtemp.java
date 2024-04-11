package baekjoon;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;


public class bojtemp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        String A = br.readLine();

        int lt = 0;
        int rt = A.length() - 1;

        char[] arr = new char[A.length()];

        for (int i = 0; i < A.length(); i++) {
            arr[i] = A.charAt(i);
        }

        //처음부터 팰린드롬이라면 그대로 출력
        boolean isFalin = true;
        while(lt<rt){
            if(arr[lt] != arr[rt]){
                isFalin = false;
            }
            lt++;
            rt--;
            if(!isFalin) break;
        }
        if(isFalin){
            for (char x : arr) {
                bw.write(""+x);
            }
            bw.flush();
            bw.close();
            br.close();
            return;
        }


        //초기화
        lt = 0;
        rt = A.length() - 1;


        boolean isExist = false;
        while (lt < rt) {
            if (arr[lt] == arr[rt]) {
                lt++;
                rt--;

            } else if (arr[lt] != arr[rt]) {
                int idx = -1;
                for (int i = lt + 1; i < rt; i++) {
                    if (arr[lt] == arr[i]) {
                        idx = i;
                        char tmp = arr[rt];
                        arr[rt] = arr[idx];
                        arr[idx] = tmp;
                        lt++;
                        rt--;
                        isExist = true;
                    }
                }//for

                if (!isExist) break;

            }//else
        }//while
        if (isExist) {
            for (char x : arr) {
                bw.write(""+x);
            }

        } else if (!isExist) {
            bw.write("I'm Sorry Hansoo");
        }

        bw.flush();
        bw.close();
        br.close();


    }//main


}//MainClass