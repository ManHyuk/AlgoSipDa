package problems.BOJ;

import java.util.Scanner;

public class bj11653 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        primeFactorization(N);
    }

    private static void primeFactorization(int N) {

        for (int i = 2; i < N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        if (N > 1) {
            System.out.println(N);
        }

//        while (N != 1) {
//            for (int i = 2; i < N; i++) {
//                if (N % i == 0) {
//                    N /= i;
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
    }
}
