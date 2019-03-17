package problems.BOJ;

import java.util.*;

public class bj2583 {
    private static int n;
    private static int m;
    private static int k;
    private static boolean[][] map;
    private static boolean[][] isVisit;

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};

    public static void solve() throws Exception{
        ArrayList<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        map = new boolean[n][m];
        isVisit = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int j = x1; j < x2; j++) {
                for (int l = y1; l < y2; l++) {
                    map[l][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!map[i][j] && !isVisit[i][j]) result.add(DFS(i, j));
            }
        }

        System.out.println(result.size());
        Collections.sort(result);
        for (int item : result) {
            System.out.print(item + " ");
        }

    }

    static int DFS(int x, int y) {
        isVisit[x][y]= true;
        int result = 1;

        for (int i = 0; i < 4; i++) {
            int currentX = x + dx[i];
            int currentY = y + dy[i];

            if (
                    currentX < 0
                    || currentY < 0
                    || n <= currentX
                    || m <= currentY
                    || isVisit[currentX][currentY]
                    || map[currentX][currentY]
            ) {
                continue;
            }

            result += DFS(currentX, currentY);
        }


        return result;

    }
}
