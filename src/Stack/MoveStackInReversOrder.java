package Stack;
import java.util.*;
import java.util.stream.StreamSupport;

public class MoveStackInReversOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("Enter the size of stack :");
        n=sc.nextInt();
        System.out.println("Enter element : ");
        for(int i=1;i<=n;i++){
            st.push(sc.nextInt());
        }
        System.out.println(st);
        Stack rv=new Stack<>();
        while (st.size()>0){
            rv.push(st.pop());
        }
        System.out.println(rv);
    }
}
