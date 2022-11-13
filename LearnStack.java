import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
        
        Stack<Integer> stk = new Stack<>();


        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        System.out.println(stk);


        System.out.println(stk.peek());

        System.out.println(stk.pop());

        System.out.println(stk.peek());

        
    }
}
