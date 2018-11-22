package problems.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class breaking_best_and_worst_records {

    static int[] breakingRecords(int[] scores) {

        int minCount = 0;
        int maxCount = 0;
        int min = scores[0];
        int max = scores[0];

        for (int i = 0; i < scores.length; i++) {

            if (min > scores[i]) {
                min = scores[i];
                minCount++;
            }

            if (max < scores[i]) {
                max = scores[i];
                maxCount++;
            }
        }

//        System.out.print(maxCount + " ");
//        System.out.println(minCount);


        int[] result = new int[2];
        result[0] = maxCount;
        result[1] = minCount;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }

//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
