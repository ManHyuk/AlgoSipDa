package problems.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class time_conversion {

    static String timeConversion(String s) {

        String[] strArr = s.split(":");

        String hh = strArr[0];
        String mm = strArr[1];
        String zz = strArr[2].substring(0,2);
        String zone = strArr[2].substring(2,4);


        String result = "";
        if (zone.equals("AM")) {
            if (hh.equals("12")) {
                hh = "00";
            }
            result += hh + ':' + mm + ':' + zz;
        } else {
            int h = (Integer.parseInt(hh)+12);
            if (Integer.parseInt(hh) == 12) {
                h = 12;
            }

            result +=  String.valueOf(h) + ':' + mm + ':' + zz;
        }


        System.out.println(result);
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void solve() throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
    }
}
