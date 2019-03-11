package problems.BOJ;

import java.util.Scanner;

public class bj2747 {

    public static void exec() throws Exception {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

//        System.out.println(fibo(input));
        System.out.println(fiboMain(input));

    }


//    private static int fibo(int n) {
//
//        if (n == 0 || n == 1) {
//            return n;
//        }
//
//        return fibo(n-1) + fibo(n-2);
//    }

    static int fiboMain(int n) {
        return fiboTail(n, 0, 1);
    }

    static int fiboTail(int n, int before, int next) {
        if (n == 0) {
            return before;
        }
        return fiboTail(n-1, next, before + next);
    }


}
