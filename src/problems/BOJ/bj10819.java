package problems.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class bj10819 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int result = 0;
        do {
            int temp = calc(a);
            result = Math.max(result, temp);
        } while (next(a));

        System.out.println(result);
    }

    private static int calc(int a[]) {

        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            sum += Math.abs(a[i] - a[i-1]);
        }
        return sum;
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
