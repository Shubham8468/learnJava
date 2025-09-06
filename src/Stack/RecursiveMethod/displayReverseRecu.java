package Stack;

import java.util.Stack;

public class displayReverseRecu {
    public static void DisplayReverse(Stack<Integer> st){
        if(st.isEmpty())return ;
        int top=st.pop();
        System.out.print(top+",");
        DisplayReverse(st);

        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(4);
        st.push(6);
        st.push(8);
        System.out.println(st);
        DisplayReverse(st);

    }
}
