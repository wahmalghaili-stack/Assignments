package assignment_1.circularlinkedlist;

public class SearchInCircularList {
    public static boolean search(CNode head, int target) {
        if (head == null) return false;
        CNode current = head;
        do {
            if (current.data == target) return true;
            current = current.next;
        } while (current != head);
        return false;
    }

    public static void main(String[] args) {
        CNode head = new CNode(1);
        CNode second = new CNode(2);
        CNode third = new CNode(3);
        head.next = second;
        second.next = third;
        third.next = head;

        int target = 2;
        System.out.println("Element " + target + " found? " + search(head, target));
    }
}
