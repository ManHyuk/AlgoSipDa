package problems.BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj1260 {

    static boolean[] isVisited;
    static int n;
    static int m;
    static int[][] mat;
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);


        n = sc.nextInt();
        m = sc.nextInt();
        int startIdx = sc.nextInt();

        isVisited = new boolean[1001];
        mat = new int[1001][1001];
        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            mat[x][y] = mat[y][x] = 1;
        }
        DFS(startIdx);
        for (int i = 0; i < isVisited.length; i++) {
            isVisited[i] = false;
        }

        System.out.println();
        BFS(startIdx);
    }

    static void DFS(int v) {

        System.out.print(v+" ");
        isVisited[v] = true;

        for (int i = 1; i <= m; i++) {
            if (!isVisited[i] && mat[v][i] == 1) {
                DFS(i);
            }
        }
    }

    static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(v);
        while (!q.isEmpty()) {
            int temp = q.poll();
            isVisited[temp] = true;
            System.out.print(temp + " ");
            for (int i = 0; i <= n; i++) {
                if (mat[temp][i] == 1 && !isVisited[i]) {
                    q.offer(i);
                    isVisited[i] =true;
                }
            }

        }

    }
}
