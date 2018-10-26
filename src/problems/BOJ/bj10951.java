package problems.BOJ;

import java.util.Scanner;

public class bj10951 {
    static public void exec() throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
