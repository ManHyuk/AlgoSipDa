package problems.HackerRank;

import java.io.*;
import java.util.GregorianCalendar;

public class day_of_programmer {
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(year));
        return "";
    }

    public static void solve() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }


}
