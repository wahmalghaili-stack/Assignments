package assignment_1.linkedlist;

public class SearchInLinkedList {
    public static int search(Node head, int target) {
        Node current = head;
        int position = 1;
        while (current != null) {
            if (current.data == target) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int target = 30;
        int pos = search(head, target);
        System.out.println("Element " + target + " found at position: " + pos);
    }
}
