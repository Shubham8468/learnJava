package Stack;
import java.util.*;
public class InsertionStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
         st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int idx=3;
        int val=23;
        Stack<Integer> temp=new Stack<>();
        while (st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
