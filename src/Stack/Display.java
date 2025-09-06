package Stack;
import java.util.*;
public class Display {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> temp=new Stack<>();
        while(st.size()!=0) {
            temp.push(st.pop());

        }
        while(temp.size()!=0){
            int val=temp.pop();
            System.out.println(val);
            st.push(val);

        }


    }
}
