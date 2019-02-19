package problems.BOJ;

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
    }

    static void DFS(int v) {

        isVisited[v] = true;
        System.out.println(v);
        for (int i = 1; i <= m; i++) {
            if (!isVisited[i] && mat[v][i] == 1) {
                DFS(i);
            }
        }
    }
}
