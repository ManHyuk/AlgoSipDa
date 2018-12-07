package problems.HackerRank;

import java.util.Scanner;

public class loops_30 {

    static void gugu(int n) {

        for (int i = 1; i < 11; i++) {

            System.out.print(n);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(n*i);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws Exception {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        gugu(n);
        scanner.close();
    }
}
