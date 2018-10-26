package problems.BOJ;

import java.util.Scanner;

public class bj10974 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i+1;
        }

        do {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

        }while (next(a));
    }

    private static boolean next(int[] a) {
        int i = a.length-1; // 3

        while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }

        if (i <= 0) return false;

        int j = a.length-1;

        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;

        while (i < j ){
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
}
