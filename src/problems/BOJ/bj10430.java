package problems.BOJ;

import java.util.Scanner;

public class bj10430 {

    static public void exec() throws Exception {

        int a, b, c;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        a %= c;
        b %= c;

        System.out.println((a+b)%c);
        System.out.println((a+b)%c);
        System.out.println((a*b)%c);
        System.out.println((a*b)%c);


    }
}
