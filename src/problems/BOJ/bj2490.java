package problems.BOJ;

import java.util.Scanner;

public class bj2490 {
    public static void solve() throws Exception{
        Scanner sc = new Scanner(System.in);


        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextLine();
        }

        char[] result = new char[3];
        int idx = 0;
        for (String item : input) {

            int count = 0;
            for (int i = 0; i < item.length(); i++) {
                if (item.charAt(i) == '1') {
                    count += 1;
                }
            }
            if (count == 3) {
                result[idx] = 'A';
            }
            if (count == 2) {
                result[idx] = 'B';
            }
            if (count == 1) {
                result[idx] = 'C';
            }
            if (count == 4) {
                result[idx] = 'E';
            }
            if (count == 0 ) {
                result[idx] = 'D';
            }

            idx += 1;
        }
        for (char c :
                result) {
            System.out.println(c);
        }
    }


}
