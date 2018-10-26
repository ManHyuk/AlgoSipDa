package problems.BOJ;

import java.util.Scanner;

public class bj10950 {
    static public void exec() throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}
