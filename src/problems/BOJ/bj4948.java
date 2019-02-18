package problems.BOJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class bj4948 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;


            int[] list = new int[n*2];
            for (int i = n+1; i < n*2-1; i++) {
                list[i] = i;
            }

//            List<Integer> result = Arrays.stream(list)
//                    .filter(item -> isPrime(item)).mapToObj(i -> i)
//                    .collect(Collectors.toList());

            List<Integer> result = IntStream.range(n+1, (n*2)+1).filter(item -> isPrime(item))
                    .mapToObj(i -> i).collect(Collectors.toList());

            System.out.println(result.size());


        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;

        int q = (int) Math.floor(Math.sqrt(n));

        for (int i = 2; i <= q; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
