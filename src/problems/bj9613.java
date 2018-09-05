package problems;

import java.util.Scanner;

public class bj9613 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {

            int N = sc.nextInt();
            int[] inputs = new int[N];
            for (int j = 0; j < N; j++) {
                inputs[j] = sc.nextInt();
            }

            int result = 0;

            for (int j = 0; j < N - 1; j++) {

                for (int k = j+1; k < N; k++) {

                    result += gcd(inputs[j], inputs[k]);

                }
            }
            System.out.println(result);
        }
    }

    static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x%y);
    }
}
