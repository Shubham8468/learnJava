package Stack.RecursiveMethod;

import java.util.*;

public class insertAtBottom {
    public static void InsertAtBottom(Stack<Integer> st,int n){
        if(st.isEmpty()){
            return ;
        }
        int top=st.pop();
        InsertAtBottom(st,n);
        if(st.isEmpty())st.push(n);
        st.push(top);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(9);
        int n;
        System.out.println("Enter a number :");
        n= sc.nextInt();
        System.out.println(st);
        InsertAtBottom(st,n);
        System.out.println(st);



    }
}
