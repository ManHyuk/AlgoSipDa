package problems.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class bj5543 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] buggers = new int[3];
        for (int i = 0; i < 3; i++) {
            buggers[i] = sc.nextInt();
        }

        int[] sides = new int[2];
        for (int i = 0; i < 2; i++) {
            sides[i] = sc.nextInt();
        }
        int minSideCost = Math.min(sides[0], sides[1]);

        int min = 20001;
        for (int bugger : buggers) {
            min = Math.min(min, bugger);
        }
        System.out.println(min + minSideCost - 50);
    }
}
