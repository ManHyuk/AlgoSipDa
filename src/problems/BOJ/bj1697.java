package problems.BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj1697 {

    private static final int MAX = 1000000;

    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Integer> q = new LinkedList<Integer>();

        boolean[] check = new boolean[MAX]; // 방문확인
        int[] dist = new int[MAX]; // 몇번만에 방문했는지

        check[n] = true;
        dist[n] = 0;

        ((LinkedList<Integer>) q).push(n);

        while (!q.isEmpty()) {
            int now = q.remove();

            if (now-1 >= 0) {
                if (check[now-1] == false) {
                    ((LinkedList<Integer>) q).push(now-1);
                    check[now-1] = true;
                    dist[now-1] = dist[now] + 1;
                }
            }

            if (now + 1 < MAX) {
                if (check[now+1] == false) {
                    ((LinkedList<Integer>) q).push(now+1);
                    check[now+1] = true;
                    dist[now+1] = dist[now] + 1;
                }
            }

            if (now*2 < MAX) {
                if (check[now*2] == false) {
                    ((LinkedList<Integer>) q).push(now*2);
                    check[now*2] = true;
                    dist[now*2] = dist[now] + 1;
                }
            }
        }
        System.out.println(dist[m]);
    }
}
