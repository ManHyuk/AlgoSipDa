package problems.BOJ;

import java.util.Scanner;

public class bj14888 {

    static int n;
    static int[] op;
    static int[] input;

    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;


    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        op = new int[4];

        for (int i = 0; i < 4; i++) {
            op[i] = sc.nextInt();
        }

        DFS(1, input[0]);

        System.out.println(min);
        System.out.println(max);


    }


    static boolean DFS(int idx, int amount) {
        if (idx == n) {
            min = Math.min(amount, min);
            max = Math.max(amount, max);
            return true;
        }

        if (op[0] > 0) {
            op[0] -= 1;
            DFS(idx+1, amount + input[idx]);
            op[0] += 1;
        }
        if (op[1] > 0) {
            op[1] -= 1;
            DFS(idx+1, amount - input[idx]);
            op[1] += 1;
        }
        if (op[2] > 0) {
            op[2] -= 1;
            DFS(idx+1, amount * input[idx]);
            op[2] += 1;
        }
        if (op[3] > 0) {
            op[3] -= 1;
            DFS(idx+1, amount / input[idx]);
            op[3] += 1;
        }


        return true;
    }
}
