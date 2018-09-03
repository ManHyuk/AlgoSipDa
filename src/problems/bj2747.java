package problems;

import java.util.Scanner;

public class bj2747 {

    public static void exec() throws Exception {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(fibo(input));
    }


    private static int fibo(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
