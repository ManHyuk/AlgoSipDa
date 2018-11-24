package problems.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class bon_appetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;

        for (int item : bill) {
            sum += item;
        }

        int actual = (sum - bill.get(k))/2;

        int result = b - actual;

//        if (bill.get(k) >= b) {
//            System.out.println("Bon Appetit");
//        } else {
//            System.out.println(result);
//        }

        System.out.println(sum / 2 == b ?  "Bon Appetit" : (sum/2) -b);
//        System.out.println( sum / 2 == actual ? bill.get(k) / 2 : "Bon Appetit" );
    }

    public static void solve() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
