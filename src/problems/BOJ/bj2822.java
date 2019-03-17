package problems.BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class bj2822 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] resultIdx = new int[5];
        int[] pointer = new int[8];
        int[] resultPointer = new int[5];

        for (int i = 0; i < 8; i++) {
            pointer[i] = sc.nextInt();
        }
        for (int i = 4; i>=0; i--) {
            int max = 0;
            int idx = 0;
            for (int j = 0; j < 8; j++) {
                if (max < pointer[j]) {
                    max = pointer[j];
                    idx = j;
                }
            }
            pointer[idx] = 0;
            resultPointer[i] = max;
            resultIdx[i] = idx + 1;
        }
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += resultPointer[i];
        }
        Arrays.sort(resultIdx);
        System.out.println(result);
        for (int i = 0; i < 5; i++) {
            System.out.print(resultIdx[i] + " ");
        }
    }
}
