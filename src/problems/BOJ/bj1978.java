package problems.BOJ;

import java.util.Scanner;

public class bj1978 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {

            int input = sc.nextInt();

            if (isPrime(input)) {
                count++;
            }
        }

        System.out.println(count);

    }

    private static boolean isPrime(int x) {

        if (x < 2) {
            return false;
        }

        for (int i = 2; i*i < x; i++) {
            if (x%i == 0) {
                return false;
            }
        }

        return true;
    }
}
