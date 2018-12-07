package problems.HackerRank;

import java.util.Scanner;

public class arrays_30 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws Exception {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();

        int[] result = new int[n];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length-1-i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }
    }
}
