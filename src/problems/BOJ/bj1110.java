package problems.BOJ;

import java.util.Scanner;

public class bj1110 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int count = 0;
        int ans = input;
        int sum = 0;


        while (true) {
            int x = input / 10;
            int y = input % 10;

            sum = (x + y) % 10;

            input = (y * 10) + sum;
            count += 1;

            if (ans == input) {
                break;
            }

        }
        System.out.println(count);

    }

}
