package problems.BOJ;

import java.util.Scanner;

public class bj1929 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        prime(start, end);
    }

    private static void prime(int start, int end) {

        boolean check[] = new boolean[end+1];
        check[0] = check[1] = true;

        for (int i = 2; i <= end; i++) {
            if (!check[i]) {
                for (int j = i+i; j <= end; j+=i) {
                    check[j] = true;
                }
            }
        }

        for (int i = start; i < end; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

}
