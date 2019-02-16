package problems.BOJ;

import java.util.Scanner;

public class bj2675 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] str = new String[N];
        int[] count = new int[N];

        for (int i = 0; i < N; i++) {
            count[i] = sc.nextInt();
            str[i] = sc.next();
        }


        for (int i = 0; i < N; i++) {
            char[] temp = str[i].toCharArray();
            for (int j = 0; j < temp.length; j++) {
                for (int k = 0; k < count[i]; k++) {
                    System.out.print(temp[j]);
                }
            }
            System.out.println();
        }
    }
}
