package problems.BOJ;

import java.util.Scanner;

public class bj10448 {
    private static int maxSize = 45;
    private static int[] map = new int[maxSize];
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i < maxSize; i++) {
            map[i-1] = (i * (i + 1)) /2 ;
        }

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            if (isEureka(sc.nextInt())) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

    private static boolean isEureka(int n) {
        for (int i = 0; i < maxSize-1; i++) {
            for (int j = 0; j < maxSize-1; j++) {
                for (int k = 0; k < maxSize-1; k++) {
                    if (map[i] + map[j] + map[k] == n) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
