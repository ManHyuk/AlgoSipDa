package problems.BOJ;

import java.util.Scanner;

public class bj10809 {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int[] result = new int[200];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        word = new StringBuilder(word).reverse().toString();

        char[] arr = word.toCharArray();


        int idx = arr.length-1;
        for (char item : arr) {
            int ascii = (int) item;
            result[ascii] = idx;
            idx--;
        }

        for (int i = 97; i < 123; i++) {
            System.out.print(result[i]+ " ");
        }


    }
}
