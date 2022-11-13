import java.util.*;

public class StudentHashSet {
    public static void main(String[] args) {
         
         Set<StudentSet> stset = new TreeSet<>();

         stset.add(new StudentSet("Anuj", 1));
         stset.add(new StudentSet("shubham", 2));
         stset.add(new StudentSet("alisha", 3));
         stset.add(new StudentSet("Anuja", 4));

         stset.add(new StudentSet("Anuj", 1));

         System.out.println(stset);

    }
    
}
