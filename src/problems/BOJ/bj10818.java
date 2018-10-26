package problems.BOJ;

import java.util.Scanner;

public class bj10818 {
    static public void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            min = input;
            if (min > input) {
                min = input;
            }
            if (max < input) {
                max = input;
            }
        }
        String result = min +" "+ max;
        System.out.println(result);
    }
}
