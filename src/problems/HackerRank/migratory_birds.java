package problems.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class migratory_birds {

    static int migratoryBirds(List<Integer> arr) {

        int[] count = new int[6];

        for (int item : arr) {
            count[item]++;
        }


        int max = 0;
        int maxIndex = 0;
        for (int i = 1; i < 6; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
        return maxIndex;

    }

    public static void solve() throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = migratoryBirds(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

        List<Integer> arr = new ArrayList<>();

        String[] str = "1 2 3 4 5 4 3 2 1 3 4".split(" ");

        for (int i = 0; i < str.length; i++) {
            arr.add(Integer.parseInt(str[i]));
        }
        migratoryBirds(arr);
    }
}
