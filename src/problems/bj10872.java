package problems;

import java.util.Scanner;

public class bj10872 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if (n < 2) {
            return 1;
        }

        return n * factorial(n-1);
    }
}
