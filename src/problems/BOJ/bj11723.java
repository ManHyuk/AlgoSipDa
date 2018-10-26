package problems.BOJ;

import java.util.Scanner;

public class bj11723 {
    static public void exec() throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int bitSet = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String command = sc.next();

            if ("add".equals(command)) {
                int n = sc.nextInt();
                bitSet = bitSet | (1 << n);

            } else if ("remove".equals(command)) {
                int n = sc.nextInt();
                bitSet = bitSet & ~(1 << n);

            } else if ("check".equals(command)) {

                int n = sc.nextInt();
                int result = (bitSet & (1 << n));
                if (result > 0) {
                    answer.append("1\n");
                    System.out.println(1);
                } else if (result == 0) {
                    answer.append("0\n");
                    System.out.println(0);
                }

            } else if ("toggle".equals(command)) {

                int n = sc.nextInt();
                bitSet = bitSet ^ (1 << n);

            } else if ("all".equals(command)) {

                bitSet = (1 << 21) - 1;
                bitSet = bitSet & ~(1);

            } else if ("empty".equals(command)) {

                bitSet = 0;
            }
        }
        System.out.println(answer);


    }
}
