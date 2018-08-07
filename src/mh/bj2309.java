package mh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bj2309 {

    public static void exec() throws Exception {
//        ArrayList<Integer> input = new ArrayList<>();

        int[] input = new int[9];

        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        int totalSum = 0;

        for (int i = 0; i < 9; i++) {
            input[i] = sc.nextInt();
            totalSum += input[i];
        }
        Arrays.sort(input);

        for (int i = 0; i < 9; i++) {
            if(flag) break;

            for (int j = 0; j < 9; j++) {
                if (i == j) continue;

                int exp1 = input[i];
                int exp2 = input[j];

                if (totalSum - exp1 - exp2 == 100) {
                    input[i] = 0;
                    input[j] = 0;

                    flag = true;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (input[i] != 0) System.out.println(input[i]);
        }
    }


}
