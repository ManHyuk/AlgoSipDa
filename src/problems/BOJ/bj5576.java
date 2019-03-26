package problems.BOJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bj5576 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int sumA = 0;
        int sumB = 0;

        for (int i = a.length-1; i > a.length-4; i--) {
            sumA += a[i];
        }
        for (int i = b.length-1; i > b.length-4 ; i--) {
            sumB += b[i];
        }
        System.out.print(sumA + " " + sumB);
    }
}
