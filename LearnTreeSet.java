import java.util.*;
public class LearnTreeSet {
    public static void main(String[] args) {
        
        Set<Integer>ts=new TreeSet<>();

        
        ts.add(100);
        ts.add(300);
        ts.add(40);
        ts.add(70);
        ts.add(70);
        ts.add(65);
        ts.add(840);
        ts.add(80); 
  
 
        System.out.println(ts.contains(30));
      

        System.out.println(ts);
        System.out.println(ts.size());


        ts.clear();

        System.out.println(ts);

    }
    
}
