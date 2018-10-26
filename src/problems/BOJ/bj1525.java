package problems.BOJ;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj1525 {

    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int start = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                if (temp == 0) {
                    temp = 9;
                }
                start = start*10 + temp;
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        ((LinkedList<Integer>) q).add(start);
        d.put(start, 0);

        while (!q.isEmpty()) {
            int now_num = q.remove();
            String now = Integer.toString(now_num);

            int z = now.indexOf('9');
            int x = z/3;
            int y = z%3;

            for (int i = 0; i < 4; i++) {
                int nx = x +dx[i];
                int ny = y +dy[i];

                if (nx>=0 && nx<n && ny>=0 && ny<n) {

                    StringBuilder next = new StringBuilder(now);
                    char temp = next.charAt(x*3+y);
                    next.setCharAt(x*3+y, next.charAt(nx*3+ny));
                    next.setCharAt(nx*3+ny, temp);
                    int num = Integer.parseInt(next.toString());

                    if (!d.containsKey(num)) {
                        d.put(num, d.get(now_num)+1);
                        ((LinkedList<Integer>) q).add(num);
                    }
                }
            }

        }
        if (d.containsKey(123456789)) {
            System.out.println(d.get(123456789));
        } else {
            System.out.println("-1");
        }
    }
}
