package assignment_1.linkedlist;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ConcatenateLinkedLists {
    public static Node concatenate(Node head1, Node head2) {
        if (head1 == null) return head2;
        Node current = head1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head2;
        return head1;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(3);

        Node list2 = new Node(4);
        list2.next = new Node(5);

        Node merged = concatenate(list1, list2);
        printList(merged);
    }
}
