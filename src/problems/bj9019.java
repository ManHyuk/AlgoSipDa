package problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj9019 {


    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            boolean[] check = new boolean[100001];
            int[] dist = new int[100001];
            int[] from = new int[100001];
            char[] how = new char[100001];

            check[n] = true;
            dist[n] = 0;
            from[n] = -1;

            Queue<Integer> q = new LinkedList<Integer>();

            ((LinkedList<Integer>) q).add(n);

            while (!q.isEmpty()) {

                int now = q.remove();

                int next = (now * 2) % 10000;
                if (check[next] == false) {
                    ((LinkedList<Integer>) q).add(next);
                    check[next] = true;
                    dist[next] = dist[now] + 1;
                    from[next] = now;
                    how[next] = 'D';
                }

                next = now -1;
                if (next == -1 ) next =  9999;
                if (check[next] == false) {
                    ((LinkedList<Integer>) q).add(next);
                    check[next] = true;
                    dist[next] = dist[now] + 1;
                    from[next] = now;
                    how[next] = 'S';
                }

                next = (now%1000)*10 + now/1000;
                if (check[next] == false) {
                    ((LinkedList<Integer>) q).add(next);
                    check[next] = true;
                    dist[next] = dist[now] + 1;
                    from[next] = now;
                    how[next] = 'L';
                }

                next = (now/10) + (now%1000)*10;
                if (check[next] == false) {
                    ((LinkedList<Integer>) q).add(next);
                    check[next] = true;
                    dist[next] = dist[now] + 1;
                    from[next] = now;
                    how[next] = 'R';
                }
            }

            StringBuilder sb = new StringBuilder();
            while (m != n) {
                sb.append(how[m]);
                m = from[m];
            }
//            print(n, m);
            System.out.println(sb.reverse());
        }


    }

//    private static void print(int a, int b) {
//        if (a == b) return;
//        print(a, from[b]);
//        System.out.println(how[b]);
//    }
}
