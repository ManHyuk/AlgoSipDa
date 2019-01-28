package problems.BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj15552 {
    public static void solve() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            String str = bufferedReader.readLine();
            String[] strArr = str.split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            int result = a+b;
            bufferedWriter.write(result);
            bufferedWriter.newLine();
//            System.out.println(result+"");
        }

        bufferedWriter.flush();
//        bufferedWriter.close();
    }
}
