package problems;

import java.util.Scanner;

public class bj11005 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = convert(a,b);
        System.out.println(result);
    }


    static String convert(int x, int y) {

        String result = "";
        while (x > 0) {
            if ( x % y < 10) {
                result = (x % y) + result; // 오른쪽에서 왼쪽으로 저장
                x = x / y;
            } else {
                int temp = (x % y) + 55; // A의 아스키코드는 65
                result = (char)temp + result;
                x = x / y;
            }
        }
        return result;
    }
}
