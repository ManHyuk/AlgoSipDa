package problems.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {

        int x = x1;
        int y = x2;


        boolean flag = false;
        for (int i = 0; i < 10000; i++) {

            x += v1;
            y += v2;

            if (x == y) {
                flag = true;
                break;
            }
        }

        return flag ? "YES" : "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
