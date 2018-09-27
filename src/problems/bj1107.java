package problems;

import java.util.Scanner;

public class bj1107 {

    private static boolean[] broken = new boolean[10];

    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            broken[k] = true;
        }

        int count = Math.abs(n - 100);

        for (int i = 0; i < 1000000; i++) {

            int c = i;
            int len = possible(c);

            if (len > 0) {
                int press = Math.abs(c - n); // +- 버튼

                if (count > len + press) {
                    count = len + press;
                }
            }
        }

        System.out.println(count);
    }

    private static int possible(int c) {

        if (c == 0) {
            return broken[0] ? 0 : 1;
        }

        int len = 0;
        while( c > 0 ) {
            if (broken[ c % 10]) {
                return 0;
            }
            len += 1; // 숫자 버튼
            c /= 10;
        }
        return len;
    }
}
