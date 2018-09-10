package problems;

import java.util.Scanner;

public class bj1676 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(counting(n));

    }

    private static int counting(int n) {

        int result = 0;
        for (int i = 5; i <= n; i*=5) {
            result += n / i;
        }
        return result;
    }
}
