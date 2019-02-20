package problems.BOJ;

import java.util.Scanner;

public class bj2960 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean[] isPrime = new boolean[n+1];
        for(int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        int count = 0;

        for(int i = 2; i <= n; i++) {
            for(int j = i; j <= n; j += i) {
                if(!isPrime[j]) {
                    continue;
                }

                isPrime[j] = false;
                count += 1;
                if(count == k) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
