package Stack;
import java.util.*;
public class  Basic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
       st.push(34);
       st.push(78);
       st.push(23);
       //st.push(0);
        System.out.println(st.peek());
        System.out.println(st);
    }

}
