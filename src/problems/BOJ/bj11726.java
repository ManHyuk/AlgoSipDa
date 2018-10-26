package problems.BOJ;

import java.util.Scanner;

public class bj11726 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int d[] = new int[1001];

        d[0] = 1;
        if (n > 0) d[1] = 1;
        for (int i=2; i<=n; i++) {
            d[i] = d[i-2] + d[i-1];
            d[i] %= 10007;
        }
        System.out.println(d[n]);
    }

}
