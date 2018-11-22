package problems.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class between_two_sets {
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */

        int x = 1, r = 0, j = 0, count = 0;
        int[] d = new int[101];
        for (x = 1; x < 101; x++) {
            int c = 0;
            for (int i = 0; i < a.length; i++) {
                if (x % a[i] == 0 && x >= a[i]) {
                    c++;
                }
            }
            if (c == a.length) {
                d[j] = x;
                r++;
                j++;
            }
        }
        for (j = 0; j < r; j++) {
            int c = 0;
            for (int i = 0; i < b.length; i++) {
                if (b[i] % d[j] == 0) {
                    c++;
                }
            }
            if (c == b.length) {
                count++;
            }
        }
        return count;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void solve() throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

//        bw.write(String.valueOf(total));
//        bw.newLine();
//
//        bw.close();
    }
}
