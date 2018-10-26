package problems.BOJ;

import java.util.Scanner;

public class bj2745 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        int result = convert(a,b);
        System.out.println(result);

    }


    private static int convert(String x, int y ) {

        int result = 0;
        int M = 1;

        for (int i = 0; i < x.length(); i++) {

            if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
                result = result + (x.charAt(i) - '0') * M;
            } else {
                result = result + (x.charAt(i) - 'A' + 10) * M;
            }

            M = M * y; // 10의 제곱

        }

        return result;
    }
}
