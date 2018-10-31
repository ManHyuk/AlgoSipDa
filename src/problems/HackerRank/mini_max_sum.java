package problems.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class mini_max_sum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long result = 0;
        long min = arr[0];
        long max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];

            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(result-max);
        System.out.print(" ");
        System.out.print(result-min);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws Exception {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
