package problems.HackerRank;

import java.util.Scanner;

public class recursion_30 {
    static int factorial(int n) {

        int result = 1;

        if (n == 0) {
            result = 0;
            return result;
        }
        if (n == 1) {
            result = 1;
            return result;
        };
        if (n == 2) {
            result = 2;
            return result;
        }


        for (int i = 0; i < n; i++) {
            result *= n-i;
        }
        System.out.println(result);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void solve() throws Exception {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
