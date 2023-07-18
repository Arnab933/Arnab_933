package DataStructureInJava.QueueConcept;
import java.util.*;

public class Datastructure_algo3_priorityQueue {
    public static void main(String args[]) {
        // Queue<Double> queue = new PriorityQueue<>();
        // /*
        // * PriorityQueue:A FIFO data structure that serves elements with the highest
        // * priorites first before elements with lower priority */
        // queue.offer(9.0);
        // queue.offer(8.0);
        // queue.offer(5.0);
        // queue.offer(6.0);
        // queue.offer(10.0);
        // System.out.println(queue);
        // while (!queue.isEmpty()) {
        // System.out.println(queue.poll());
        // System.out.println(queue);
        // }
        // System.out.println(queue.isEmpty());

        Queue<String> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        /*
         * PriorityQueue:A FIFO data structure that serves elements with the highest
         * priorites first before elements with lower priority
         */
        queue1.offer("F");
        queue1.offer("A");
        queue1.offer("B");
        queue1.offer("C");
        queue1.offer("E");
        System.out.println(queue1);
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());

        }
        System.out.println(queue1.isEmpty());
    }
}
