package problems.BOJ;

import java.util.Scanner;

public class bj1546 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        double[] input = new double[N];
        double max = 0;
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
            if (max < input[i]) {
                max = input[i];
            }
        }

        double[] result = new double[N];
        for (int i = 0; i < N; i++) {
            result[i] = input[i]/max * 100;
        }

        double ans = 0;
        for (double item :
                result) {
            ans += item;
        }

        System.out.println(ans/N);
    }
}
