package problems;

import java.lang.reflect.Array;
import java.util.*;

public class nnnnn {
    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = 2;
        for (int i = a; i < 10-a; i++) {
            System.out.println(i);
        }

        int c = sc.nextInt();

//        int card[] = new int[c];
//        for (int i = 0; i < c; i++) {
//            card[i] = i+1;
//        }


        ArrayList<Integer> card = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            card.add(i+1);
        }


        int p = sc.nextInt();
        int n[] = new int[p];
        for (int i = 0; i < p; i++) {
            n[i] = sc.nextInt();
        }



//        sorting(card, n);
    }

    private static void sorting(ArrayList card, int[] n) {

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> store = new LinkedList<>();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> innerArr = new ArrayList<Integer>();

        for (int i = 0; i < n.length; i++) {


            for (int j = 0; j < n[i]; j++) {

//                arr.add(new int[]{(int)card.get(0)}); // 앞에 n[i]개 저장
//                arr.add(new int[]{(int)card.get(card.size()-1)}); // 뒤에 n[i]개 저장

                innerArr.add((Integer)card.get(0)); // 앞에 n[i]개 저장
                innerArr.add((Integer) card.get(card.size()-1)); // 뒤에 n[i]개 저장
                arr.add(innerArr);


                card.remove(0); // 카드 앞부터 j개 삭제
                card.remove(card.size()-1); // 카드 뒤부터 j개 삭제

                Collections.sort(arr.get(j));
            }
       }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
