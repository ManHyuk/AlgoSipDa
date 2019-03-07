package problems.BOJ;

import java.util.Scanner;

public class bj5063 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long r = sc.nextInt();
            long e = sc.nextInt();
            long c = sc.nextInt();

            if (r < (e-c)) {
                System.out.println("advertise");
            } else if ( r == (e-c)) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}
