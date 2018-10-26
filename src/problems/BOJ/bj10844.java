package problems.BOJ;

import java.util.Scanner;

public class bj10844 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int d[][] = new int[101][101];
        for (int i = 1; i <= 9; i++) {
            d[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            d[i][0] = d[i - 1][1];
            for (int j = 1; j <= 9; j++) {
                d[i][j] = (d[i - 1][j - 1] + d[i - 1][j + 1]) % 1000000000;
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += d[n][i];
        }
        System.out.println(sum % 1000000000);


    }
}
