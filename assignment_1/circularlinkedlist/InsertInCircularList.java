package assignment_1.circularlinkedlist;

class CNode {
    int data;
    CNode next;
    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertInCircularList {
    public static CNode insertAtPosition(CNode head, int data, int position) {
        CNode newNode = new CNode(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        if (position == 1) {
            newNode.next = head;
            CNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            return newNode;
        }
        CNode current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void printList(CNode head) {
        if (head == null) return;
        CNode current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CNode head = new CNode(10);
        head.next = head;

        head = insertAtPosition(head, 20, 2);
        head = insertAtPosition(head, 15, 2);
        printList(head);
    }
}
