package problems.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dictionaries_and_maps_30 {

    public static void solve() throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();

            if(!myMap.containsKey(s))
                System.out.println("Not found");
            else {
                System.out.println(s + "=" + myMap.get(s));
            }

            if (!myMap.containsKey(s)) {
                System.out.println("\nNot found");
                continue;
            }
            System.out.println(s + "=" + myMap.get(s));
        }
        in.close();

    }
}
