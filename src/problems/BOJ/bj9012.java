package problems.BOJ;

import java.util.Scanner;
import java.util.Stack;

public class bj9012 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Character> st = new Stack<>();

        while (n > 0) {
            String input = sc.next();
            if(isValid(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            n--;
        }
    }

    private static boolean isValid(String input) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                st.push('(');
            }else {
                if (st.empty()) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.empty();
    }
}
