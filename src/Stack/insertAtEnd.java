package Stack;
import java.util.*;
public class insertAtEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the element :");
        n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        Stack<Integer> s=new Stack<>();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        st.push(n);
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        System.out.println(st);
    }
}
