package problems.BOJ;


import java.util.*;


public class bj1966 {
    private static class Node {
        public int index;
        public int priority;

        public Node(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }


    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        while (T-- > 0) {
            LinkedList<Node> q = new LinkedList<>();
            int N = sc.nextInt();
            int M = sc.nextInt();

            for (int i = 0; i < N; i++) {
                q.addLast(new Node(i, sc.nextInt()));
            }


            int count = 0;
            while (!q.isEmpty()) {
                Node node = q.poll();

                boolean check = false;
                for (Node item : q) {
                    if (item.priority > node.priority) {
                        check = true;
                    }
                }

                if (!check) {
                    count += 1;
                    if (node.index == M) {
                        break;
                    }
                } else {
                    q.addLast(node);
                }
            }
            System.out.println(count);
        }

    }


    static int getMax(int[] list) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return 0;
    }

    ;
}
