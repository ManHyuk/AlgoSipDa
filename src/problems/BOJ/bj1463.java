package problems.BOJ;

import java.util.Scanner;

public class bj1463 {

    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(dd(n));

    }

    private static int dd(int n ) {
        int[] d = new int[n+1];

        if (n == 1) return 0;
        if (d[n] > 0) return d[n];
        d[n] = dd(n-1) +1;

        if (n%2 == 0) {
            int temp = dd(n/2) +1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }

        if (n%3 == 0) {
            int temp = dd(n/3) + 1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }

        return d[n];
    }
}
