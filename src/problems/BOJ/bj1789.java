package problems.BOJ;

import java.util.Scanner;

public class bj1789 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        long s = Long.parseLong(sc.nextLine());

        int n = 0;
        for (int i = 1; i <= s; i++) {
            s -=i;
            n++;
        }
        System.out.println(n);

    }
}
