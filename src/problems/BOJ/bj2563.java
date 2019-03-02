package problems.BOJ;

import java.util.Scanner;

public class bj2563 {

    private static int MAX = 101;
    private static int[][] map = new int[MAX][MAX];

    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    map[j][k] = 1;
                }
            }
        }


        int count = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if (map[i][j] == 1) {
                    count += 1;
                }
            }
        }

        System.out.println(count);

    }
}
