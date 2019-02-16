package problems.BOJ;

import java.util.Scanner;

public class bj1182 {

    static int count = 0;
    static int sum = 0;
    static int target;
    static int[] input;
    static int N;

    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        target = sc.nextInt();

        input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        DFS(0, 0);
        System.out.println(count);

    }

    static void DFS (int currIdx, int currSum) {

        if (N == currIdx) {
            if (target == currSum) {
                count += 1;
            }
            return;
        }



        DFS(currIdx+1, input[currIdx] + currSum);
        DFS(currIdx+1, currSum);
    }
}
