package problems.BOJ;

import java.util.Scanner;

public class bj14502 {

    private static int n;
    private static int m;
    private static int answer = Integer.MIN_VALUE;
    private static int[][] map, copiedMap;

    private static int[] dy = {-1, 1, 0, 0};
    private static int[] dx = {0, 0, -1, 1};

    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < n * m; i++) {
            int ny = i / m;
            int nx = i % m;

            // 0일 경우
            if (map[ny][nx] == 0) {

                map[ny][nx] = 1;
                makeWall(i, 1);
                map[ny][nx] = 0;

            }
        }

        System.out.println(answer);

    }

    static void makeWall(int v, int count) {
        if (count == 3) {
            copiedMap = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    copiedMap[i][j] = map[i][j];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (copiedMap[i][j] == 2) {
                        sparedVirus(i, j);
                    }

                }
            }

            countSafeArea();
        } else {
            for (int i = v + 1; i < n * m; i++) {
                int ny = i / m;
                int nx = i % m;

                if (map[ny][nx] == 0) {
                    map[ny][nx] = 1;
                    makeWall(i, count + 1);
                    map[ny][nx] = 0;
                }
            }
        }

    }

    static void sparedVirus(int y, int x) {
        // left, top , right, bottom
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                if (copiedMap[ny][nx] == 0) {
                    copiedMap[ny][nx] = 3;
                    sparedVirus(ny, nx);
                }
            }
        }
    }

    static void countSafeArea() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copiedMap[i][j] == 0) {
                    count += 1;
                }
            }
        }

        if (count > answer) {
            answer = count;
        }

    }


}
