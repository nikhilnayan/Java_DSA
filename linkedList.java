import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList {

    public static void reverse(Node head) {
        if (head == null)
            return;

        reverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void insert(int data, Node head) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
        return;
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        insert(data, head);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        reverse(head);
    }
}
