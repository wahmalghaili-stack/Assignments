package assignment_1.linkedlist;

public class DeleteAtPosition {
    public static Node deleteAtPosition(Node head, int position) {
        if (head == null) return null;
        if (position == 1) {
            return head.next;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) return head;
        current.next = current.next.next;
        return head;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = deleteAtPosition(head, 3);
        printList(head);
    }
}
