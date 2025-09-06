package Stack;
import java.util.*;
//In this question we create 3 stack.
//as you know stack follow the LIFO(Last in Fist out )/FILO(First in Last out ) rule.
//Than we create second stack .And we push all element from the 1st stack .
//And the Propriety of stack it store the element in the Second stack in reverse order .
//Again we pop element from the second stack and push into the 3rt stack .
//Copy stack is successfully .

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
       Stack<Integer> s=new Stack<>();
       while(!st.isEmpty()){
           s.push(st.pop());
       }
       Stack<Integer> re=new Stack<>();
       while(!s.isEmpty()){
           re.push(s.pop());
       }
        System.out.println(re);


    }
}
