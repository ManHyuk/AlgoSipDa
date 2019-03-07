package problems.BOJ;

import java.util.Scanner;

public class bj5585 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        int cost = sc.nextInt();

        int reserve = 1000 - cost;

        int[] coin = {500, 100, 50, 10, 5, 1};

        int count = 0;

        int idx = 0;
        while (true) {
            if (reserve == 0) break;

            int change = reserve / coin[idx];

            if (change != 0) {
                count += change;
                reserve -= change * coin[idx];
            }
            idx++;

        }

        System.out.println(count);


    }
}
