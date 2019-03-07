package problems.BOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bj5597 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);


        boolean[] list = new boolean[31];
        Arrays.fill(list, false);

        for (int i = 0; i < 28; i++) {
            list[sc.nextInt()] = true;
        }

        for (int i = 1; i < 31; i++) {
            if (list[i] == false) {
                System.out.println(i);
            }
        }
    }
}
