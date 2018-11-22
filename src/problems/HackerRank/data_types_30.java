package problems.HackerRank;

import java.util.Scanner;

public class data_types_30 {

    public static void solve() throws Exception {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        double second = scan.nextDouble();

        scan.nextLine();
        String third = scan.nextLine();
        s += third;
        System.out.println(i + first);
        System.out.println(d + second);
        System.out.print(s);
    }
}

