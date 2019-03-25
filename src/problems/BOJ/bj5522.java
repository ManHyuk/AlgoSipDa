package problems.BOJ;

import java.util.Scanner;

public class bj5522 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        System.out.println((L - Math.max(A%C == 0 ? A / C : A / C + 1, (B%D == 0 ? B / D : B / D + 1))));


    }
}
