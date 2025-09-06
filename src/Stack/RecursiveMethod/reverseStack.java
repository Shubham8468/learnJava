package Stack.RecursiveMethod;
import java.util.*;
public class reverseStack {
    public static  void PushAtBottom(int x,Stack<Integer> st){
        if(st.size()==0){
            st.push(x);
            return ;
        }
        int top=st.pop();
        PushAtBottom(x,st);
        st.push(top);



    }
    public static void ReverseStack(Stack<Integer> st){
     if(st.size()==1){
//    Becouse if 1 item in there stack ,no need to reverse the stack
       return ;
      }
      int top=st.pop();
      ReverseStack(st);
      PushAtBottom(top,st);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(45);
        st.push(9);
        st.push(90);
        st.push(0);
        System.out.println(st);
        ReverseStack(st);
        System.out.println(st);

    }
}
