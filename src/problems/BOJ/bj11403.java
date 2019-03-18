package problems.BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj11403 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] map = new int[n][n];
        int[][] result = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            Queue<Integer> q = new LinkedList<>();
            boolean[] isVisited = new boolean[n];
            ((LinkedList<Integer>) q).add(i);


            while (!q.isEmpty()) {
                int current = q.poll();

                for (int j = 0; j < n; j++) {
                    if (map[current][j] == 1 && !isVisited[j]) {
                        ((LinkedList<Integer>) q).add(j);

                        isVisited[j] = true;
                        result[i][j] = 1;
                    }
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
