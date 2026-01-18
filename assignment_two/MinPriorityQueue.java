package assignment_2.queue;

import java.util.PriorityQueue;

public class MinPriorityQueue {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);
        pq.offer(40);
        
        System.out.println("Priority Queue elements: " + pq);
        
        System.out.println("\nDequeue order (smallest first):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
