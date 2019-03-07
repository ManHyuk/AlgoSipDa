package problems.BOJ;

import java.util.Scanner;

public class bj2231 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for (int i = 0; i < N+1; i++) {
            int sum = 0;
            long num = i;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if ((i+sum) == N) {
                System.out.println(i);
                return ;
            }
        }
        System.out.println("0");

    }
}
