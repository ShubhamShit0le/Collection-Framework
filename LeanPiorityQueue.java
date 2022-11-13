import java.util.*;

public class LeanPiorityQueue {

    public static void main(String[] args) {
        

    Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());


    pq.offer(12);
    pq.offer(34);
    pq.offer(24);
    pq.offer(40);

    System.out.println(pq);

    pq.poll();

    
    System.out.println(pq);




    }
}
