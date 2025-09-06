package Stack;
import org.w3c.dom.ls.LSOutput;

import java.util.Stack;
//Using extra Stack
public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        Stack<Integer> temp=new Stack<>();
        while (st.size()!=0){
            temp.push(st.pop());
        }
        while (temp.size()!=0){
            int x= temp.pop();
            System.out.print(x+" ");
            st.push(x);
        }

        

    }
}
