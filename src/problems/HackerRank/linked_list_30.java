package problems.HackerRank;
import java.util.*;

public class linked_list_30 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    static Node insert(Node head, int data) {
        //Complete this method
        if (head == null) {
            return new Node(data);
        } else if (head.next == null) {
            head.next = new Node(data);
        } else {
            insert(head, data);
        }

        return head;
    }

    static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void solve() throws Exception {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}




