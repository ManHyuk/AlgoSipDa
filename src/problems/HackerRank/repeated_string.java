package problems.HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class repeated_string {
    static long repeatedString(String s, long n) {

        char firstChar = s.charAt(0);

        String addedString = "";
        for (int i = 0; i < n; i++) {
            addedString += s;
        }
        String subStr = addedString.substring(0, (int) n);

        Long count = 0L;
        for (int i = 0; i < subStr.length(); i++) {
            if (subStr.charAt(i) == firstChar) {
                count++;
            }
        }
        System.out.println(count);

//        long count =0;
//        for(char c : s.toCharArray())
//            if(c == 'a')
//                count++;
//
//        long factor = (n/s.length());
//        long rem = (n%s.length());
//        count =  factor*count  ;
//        for(int i=0;i<rem;i++)
//            if(s.charAt(i)=='a')
//                count++;
//        System.out.println(count);

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void solve() throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
