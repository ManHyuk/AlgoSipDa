package problems.HackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class diagonal_difference {


    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws Exception {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    private static int diagonalDifference(int[][] arr) {

        int n = arr.length;
        int x = arr.length;
        int y = arr[x].length;


        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            left += arr[i][i];
        }
        for (int i = 0; i < n; i++) {
            right += arr[i][n-1-i];
        }

        int result = Math.abs(left-right);
        System.out.println(result);
        return result;

    }
}
