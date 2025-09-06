package Stack;

import java.util.*;
//its means we delete the same number which are present in the array like 2,2,2 ;
public class test {
    public static int[] remove(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        res[n-1]=-1;
        for (int i = n-2; i >0 ; i--) {
            while (st.peek()<arr[i]&&st.size()>0){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }
            else{
                
            }

        }
        return arr;//wait
    }
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        int[] ans=remove(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");

        }
    }

}
