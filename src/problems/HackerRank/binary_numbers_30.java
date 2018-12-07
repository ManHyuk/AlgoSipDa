package problems.HackerRank;

import java.util.Scanner;

public class binary_numbers_30 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws Exception {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        char[] arr = Integer.toBinaryString(n).toCharArray();

        int count = 0;
        int max = 0;
        for (char item : arr) {
            if (item == '1') {
                count += 1;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(max);

    }
}
