package problems;

import java.util.Scanner;

public class bj11721 {
    static public void solve() throws Exception{
        Scanner sc = new Scanner(System.in);

        String input = sc.next();


        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(i);
            if (i % 10 == 9) {
                result += "\n";
            }
        }

        System.out.println(result);
    }
}
