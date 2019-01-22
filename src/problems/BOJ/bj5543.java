package problems.BOJ;

import java.util.Map;
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
        int min = 0;
        for (int bugger : buggers) {
            min = Math.min(min, bugger);
        }
        System.out.println(min);
    }
}
