package problems.BOJ;

import java.util.Scanner;

public class bj1065 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 99;

        if (N < 100) {
            result = N;
            System.out.println(result);
            return;
        }



        for (int i = 100; i < N; i++) {
            int a = N / 100;
            int b = (N / 10) % 10;
            int c = N % 10;

            if (a-b == b-c) {
                result++;
            }
        }

        System.out.println(result);




    }
}
