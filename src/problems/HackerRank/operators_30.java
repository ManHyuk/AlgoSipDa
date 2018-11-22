package problems.HackerRank;

import java.util.Scanner;

public class operators_30 {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost * (((double) tip_percent)/100);
        double tax = meal_cost * (((double) tax_percent)/100);

        double result = meal_cost + tip + tax;

        System.out.println(Math.round(result));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void exec() throws Exception {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
