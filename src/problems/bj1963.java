package problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj1963 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean[] prime = new boolean[10001];
        for (int i=2; i<=10000; i++) {
            if (prime[i] == false) {
                for (int j=i*i; j<=10000; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i=0; i<=10000; i++) {
            prime[i] = !prime[i];
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Queue<Integer> q = new LinkedList<Integer>();
            boolean[] check = new boolean[1000000];
            int[] dist = new int[1000000];

            check[n] = true;
            dist[n] = 0;

            ((LinkedList<Integer>) q).push(n);

            while (!q.isEmpty()) {
                int now = q.remove();

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j <= 9; j++) {
                        int next = chacnge(now, i, j);
                        if (next != -1) {
                            if (prime[next] && check[next] == false) {
                                ((LinkedList<Integer>) q).push(next);
                                dist[next] = dist[now] + 1;
                                check[next] = true;
                            }
                        }
                    }
                }
            }
            System.out.println(dist[m]);
        }

    }

    private static int chacnge(int num, int index, int digit) {

        if (index == 0 && digit == 0) return -1;
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(index, (char)(digit+'0'));
        return Integer.parseInt(sb.toString());

    }

}
