package problems.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class grading {
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */


        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38 && (grades[i] % 5) > 2) {
                grades[i] = grades[i] + (5 - grades[i]% 5);
            }
        }


        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void solve() throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
//            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
//                bw.write("\n");
            }
        }

//        bw.newLine();

//        bw.close();
    }
}
