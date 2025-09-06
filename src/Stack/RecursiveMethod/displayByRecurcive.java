package Stack;
import java.util.*;
public class displayByRecurcive {
  public static   void DisplayStack(Stack<Integer> st){
        if(st.isEmpty()){
            return ;
        }
        int top=st.pop();
        DisplayStack(st);
        System.out.print(top+",");
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(45);
        st.push(4);
        st.push(3);
        st.push(2);
        System.out.println(st);
        DisplayStack(st);

    }
}
