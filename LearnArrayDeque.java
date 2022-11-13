import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        
         ArrayDeque<Integer> ad = new ArrayDeque<>();

         ad.offer(10);
         ad.offerLast(20);
         ad.offerFirst(1);
         System.out.println(ad);

         System.out.println(ad.peekLast());


    }
}
