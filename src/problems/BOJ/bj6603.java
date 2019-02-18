package problems.BOJ;

import java.util.Scanner;

public class bj6603 {

    static int n;
    static int list[];

    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {
            n = sc.nextInt();
            if (n == 0) break;

            list = new int[n];

            for (int i = 0; i < n; i++) {
                list[i] = sc.nextInt();
            }

            DFS(0,0, "");
            System.out.println();
        }


    }

    static void DFS(int index, int count, String answer){
        if (index == n) {
            if (count == 6) {
                System.out.println(answer);
            }
            return;
        }
        DFS(index+1, count+1, answer + list[index] + " ");
        DFS(index+1, count, answer);
    }

}
