package problems;

import java.util.Scanner;

public class bj11052 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] d = new int[n+1];
        int[] p = new int[n+1];

        d[0] = 0;
        p[0] = 0;
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(d[i]+ "/" + "" + "");

                d[i] = Math.max(d[i], d[i-j]+p[j]);
            }
        }
        System.out.println(d[n]);
    }

}
