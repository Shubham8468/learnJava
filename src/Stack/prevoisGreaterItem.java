package Stack;
import java.util.*;
public class prevoisGreaterItem {
    public static int[] findgreater(int[] arr){
        int l=arr.length;
        int[] res=new int[l];
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        res[0]=-1;
        for (int i = 1; i <l ; i++) {
            while(st.peek()<arr[i]&&st.size()>=0){
                st.pop();
                if(st.size()==0){
                    break;
                }
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else {
                res[i]=st.peek();
            }
            st.push(arr[i]);

        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int[] ans=findgreater(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
