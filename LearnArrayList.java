import java.util.*;

class LearnArrayList
{
    public static void main(String[] args) {
    
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80); 

         
        // list.remove(1);
        // list.remove(Integer.valueOf(50));

        List<Integer> newlist = new ArrayList<>();
   
         newlist.add(5);
         newlist.add(8);

         newlist.addAll(list);

        //  System.out.println(list); 

        //  System.out.println(newlist);

        // for(int i = 0; i<newlist.size(); i++)
        // {
        //     System.out.println(newlist.get(i));
        // }
     
        // for ( Integer element: newlist) {
            
        //     System.out.println(element);
        // }
        
        // Iterator<Integer> it= newlist.iterator();
        
        // while(it.hasNext())
        // {
        //     System.out.println("itrator : "+it.next());
        // }




}

}