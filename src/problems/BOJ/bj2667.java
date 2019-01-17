package problems.BOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bj2667 {

    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static int[][] map = new int[25][25];
    static boolean[][] visit = new boolean[25][25];

    public static void solve() throws Exception{



        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        ArrayList<Integer> arrayList = new ArrayList();



        for (int i=0;i<N;i++) {
            String str = sc.next();
            for(int j=0;j<str.length();j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }

        int totalCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    totalCount += 1;
                    int count = DFS(N, i, j,0);
                    arrayList.add(count);
                }
            }
        }

        System.out.println(totalCount);
        Collections.sort(arrayList);
        arrayList.forEach(item -> {
            System.out.println(item);
        });
    }

    static int DFS(int N, int row, int col, int count) {
        count += 1;

        visit[row][col] = true;

        for (int i = 0; i < 4; i++) {
            int nextRow = row + dx[i];
            int nextCol = col + dy[i];

//            if (nextRow > 0 && nextRow <= N && nextCol > 0 && nextCol <= N) {
//                if(map[nextRow][nextCol] == 1 && !visit[nextRow][nextCol]) {
//                    count = DFS(N, nextRow, nextCol, count);
//                }
//            }
            if (nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= N) continue;
            if (map[nextRow][nextCol] == 0) continue;
            if (visit[nextRow][nextCol]) continue;

            count = DFS(N, nextRow, nextCol, count);
        }

        return count;
    }
}
