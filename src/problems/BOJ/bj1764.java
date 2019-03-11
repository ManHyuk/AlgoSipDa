package problems.BOJ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bj1764 {
    public static void solve() throws Exception {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] dontSee = new String[n];
        String[] dontHear = new String[m];


        for (int i = 0; i < n; i++) {
            dontSee[i] = sc.nextLine();
        }
        for (int i = 0; i < m; i++) {
            dontHear[i] = sc.nextLine();
        }

        String[] answer = new String[10];

        

    }
}
