package problems.BOJ;

import java.util.Scanner;

public class bj2292 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int start = 1;
        int count = 1;

        while (start < end) {
            start += count * 6;
            count++;
        }

        System.out.println(count);

    }
}
