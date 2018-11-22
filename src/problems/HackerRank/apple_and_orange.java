package problems.HackerRank;

import java.util.Scanner;

public class apple_and_orange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        for (int i = 0; i < apples.length; i++) {
            apples[i] = apples[i] + a;
        }

        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = oranges[i] + b;
        }

        int appleCount = 0;
        for (int i = 0; i < apples.length; i++) {
            if (apples[i] >= s && apples[i] <= t) {
                appleCount++;
            }
        }

        int orangeCount = 0;
        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] >= s && oranges[i] <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws Exception{
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
