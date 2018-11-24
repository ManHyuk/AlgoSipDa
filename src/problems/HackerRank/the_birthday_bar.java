package problems.HackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class the_birthday_bar {
    static int birthday(List<Integer> s, int d, int m) {
        int length = s.size();
        int count = 0;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum = sum + s.get(i);

            if (i > m-1) {
                sum -= s.get(i-m);
            }
            if (i >= m-1 && sum == d) {
                count += 1;
            }
        }
        System.out.println(count);
        
        return count;
    }

    public static void solve() throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int d = Integer.parseInt(dm[0]);
//
//        int m = Integer.parseInt(dm[1]);
//
//        int result = birthday(s, d, m);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

        int n = 5;
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        int d = 3;
        int m = 2;

        birthday(s, d, m);

    }
}
