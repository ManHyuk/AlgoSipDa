package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class bj10828 {
    public static void solve() throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String cmd = sc.next();
            if (cmd.equals("push")) {
                int input = sc.nextInt();
                arr.add(input);

            } else if (cmd.equals("top")) {

                System.out.println(arr.get(arr.size()-1));

            } else if (cmd.equals("pop")) {

                if (arr.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(arr.remove(arr.size()-1));
                }
            } else if (cmd.equals("size")) {
                System.out.println(arr.size());
            } else if (cmd.equals("empty")) {
                if (arr.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }

    }


}
