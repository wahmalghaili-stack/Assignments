package assignment_1.doublylinkedlist;

class DNode {
    int data;
    DNode prev, next;
    DNode(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class ReverseTraverse {
    public static void reversePrint(DNode head) {
        DNode current = head;
        if (current == null) return;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DNode head = new DNode(1);
        DNode second = new DNode(2);
        DNode third = new DNode(3);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        reversePrint(head);
    }
}
