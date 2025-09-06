package Stack;
import java.util.*;
public class DisplayUsingArr {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        int n=st.size();
        int[] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            int val=arr[i];
            System.out.println(val+" ");
            st.push(arr[i]);

        }

    }

}
