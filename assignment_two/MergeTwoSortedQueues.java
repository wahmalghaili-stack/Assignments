package assignment_2.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MergeTwoSortedQueues {
    
    public static Queue<Integer> mergeSortedQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> mergedQueue = new LinkedList<>();
        
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                mergedQueue.offer(q1.poll());
            } else {
                mergedQueue.offer(q2.poll());
            }
        }
        
        while (!q1.isEmpty()) {
            mergedQueue.offer(q1.poll());
        }
        
        while (!q2.isEmpty()) {
            mergedQueue.offer(q2.poll());
        }
        
        return mergedQueue;
    }
    
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(10);
        q1.offer(30);
        q1.offer(50);
        
        Queue<Integer> q2 = new LinkedList<>();
        q2.offer(20);
        q2.offer(40);
        q2.offer(60);
        
        System.out.println("Queue 1: " + q1);
        System.out.println("Queue 2: " + q2);
        
        Queue<Integer> merged = mergeSortedQueues(q1, q2);
        System.out.println("Merged Queue: " + merged);
    }
}
