package problems;

import java.util.Scanner;

public class bj11720 {
    static public void exec() throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String input = sc.next();

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += Integer.parseInt(input.substring(i, i+1));
        }
        System.out.println(result);
    }
}
