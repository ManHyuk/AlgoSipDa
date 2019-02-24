package problems.BOJ;

import java.util.Scanner;

public class bj10886 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cute = 0;
        int notCute = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();

            if (m == 1) {
                cute += 1;
            } else {
                notCute += 1;
            }
        }

        if (cute > notCute) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}
