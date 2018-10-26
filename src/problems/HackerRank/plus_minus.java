package problems.HackerRank;

import java.util.Scanner;

public class plus_minus {



    public static void solve() throws Exception{

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

    static void plusMinus(int[] arr) {

        double pos = 0;
        double neg = 0;
        double zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 ) {
                pos++;
            }
            if (arr[i] < 0) {
                neg++;
            }
            if (arr[i] == 0) {
                zero++;
            }
        }

        double p = pos/arr.length;
        double n = neg/arr.length;
        double z = zero/arr.length;

        System.out.println(p);
        System.out.println(n);
        System.out.println(z);

    }

}
