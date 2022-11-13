import java.util.*;

public class LearnHashSet {
    public static void main(String[] args) {
         
         Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80); 
  
 
        System.out.println(set.contains(30));
      

        System.out.println(set);

        set.clear();

        System.out.println(set);





    }
}
