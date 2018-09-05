package problems;

import java.util.Scanner;

public class bj2609 {
    static public void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));

    }

    private static int gcd(int x, int y) {
        if (y == 0 ) {
            return x;
        } else {
          return gcd(y, x%y);
        }
    }
    private static int lcm(int x, int y) {
        int gcd = gcd(x,y);
        return gcd * (x/gcd) *(y/gcd);
    }
}
