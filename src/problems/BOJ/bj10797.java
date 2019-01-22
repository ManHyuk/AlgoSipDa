package problems.BOJ;

import java.util.Scanner;

public class bj10797 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        char[] input = sc.nextLine().toCharArray();

        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (n.charAt(0) == input[i]) {
                count += 1;
            }
        }
        System.out.println(count);

    }
}
