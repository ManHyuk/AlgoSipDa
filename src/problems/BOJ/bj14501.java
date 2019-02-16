package problems.BOJ;

import java.util.Scanner;

public class bj14501 {

    public static int result = 0;
    public static int[][] input;

    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        input = new int[N+1][2];

        for (int i = 0; i < N; i++) {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
        }

        DFS(N, 0, 0);
        System.out.println(result);
    }

    static void DFS(int N, int currDepth, int currSum) {
        if (N == currDepth) {
            result = Math.max(result, currSum);
            return;
        }
        if (currDepth + input[currDepth][0] <= N) {
            DFS(N, currDepth + input[currDepth][0], currSum + input[currDepth][1]);
        }
        DFS(N, currDepth+1, currSum);
    }
}
