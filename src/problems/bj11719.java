package problems;

import java.util.Scanner;

public class bj11719 {
    static public void exec() throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (!input.isEmpty()) {
                System.out.println(input);
            }
        }
    }
}
