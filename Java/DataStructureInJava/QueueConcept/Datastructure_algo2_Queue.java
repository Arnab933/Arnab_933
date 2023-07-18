package DataStructureInJava.QueueConcept;
import java.util.*;

public class Datastructure_algo2_Queue {
    public static void main(String[] args) {
        /*
         * Queue:queue is divided into two parts thats are head and tail the first
         * object is head and the
         * last object is tail
         * add=enqueue,offer()
         * remove=deque,poll()
         */
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Arnab");
        queue.offer("Arnabpratihar");
        queue.offer("debjit");
        queue.offer("Atul");
        queue.offer("ap");
        System.out.println(queue.size());
        System.out.println(queue.contains("debjit"));
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.peek());// here display the first element of the queue
        System.out.println(queue);
        System.out.println();

    }
}
