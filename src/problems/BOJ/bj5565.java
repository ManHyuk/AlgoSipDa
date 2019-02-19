package problems.BOJ;

import java.util.Scanner;

public class bj5565 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        int[] costs = new int[9];

        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            costs[i] = sc.nextInt();
            sum += costs[i];
        }

        System.out.println(total - sum);
    }
}
