package problems;

import java.util.Scanner;
import java.util.Stack;

public class bj10799 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(count(input));

    }

    private static int count(String input) {

        int count = 0;

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                st.push('(');
            } else if (input.charAt(i) == ')'){

                if(!st.isEmpty()) st.pop();
                if (input.charAt(i-1) == '(') { // () 레이저 일 때
                    count += st.size();
                } else if (input.charAt(i-1) == ')'){ // )) 끝 부분
                    count++;
                }
            }
        }
        return count;
    }
}
