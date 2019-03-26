package problems.BOJ;


import java.util.Scanner;

public class bj1748 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int len = String.valueOf(n).length();
        int gu = 9;
        int result = 0;
        // 자리수 이하의 자리수는 모두 들어간다.
        // 1자리 9 2자리 90 3자리 900 ....
        for(int i=1;i<len;i++) {
            result += i*gu;
            gu*=10;
        }
        // 마지막 자신의 자리수는 자신 - 그 자리수의 시작 * 자리수
        result += (n-(int)Math.pow(10, len-1)+1) * len;
        System.out.println(result);
    }
}
