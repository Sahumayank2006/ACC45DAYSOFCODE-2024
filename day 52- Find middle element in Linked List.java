import java.util.Scanner;

class Node {
    int value;
    Node next;
    
    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList(int[] values) {
        if (values.length == 0) return;
        head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] values = new int[N];
            for (int i = 0; i < N; i++) {
                values[i] = sc.nextInt();
            }
            LinkedList list = new LinkedList(values);
            System.out.println(getMiddleElement(list.head));
        }
        sc.close();
    }

    public static int getMiddleElement(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow.value;
    }
}
