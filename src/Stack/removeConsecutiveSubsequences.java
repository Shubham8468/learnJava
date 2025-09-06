package Stack;
import java.util.*;
//its means we delete the same number which are present in the array like 2,2,2 ;
public class removeConsecutiveSubsequences {
    public static int[] remove(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++) {
            if (st.size() == 0||st.peek()!=arr[i]) {//if stack is empty in case we push the item from the array
                st.push(arr[i]);
            }
           else if(st.peek()==arr[i]){//here we check the peek item frome the stack and compire with the arr
                //if both items is same in case
                if (i==n-1||arr[i]!=arr[i+1]) {//base we counter the problem suppoes 2,2,2 in case its check
                    st.pop();
                }
            }
        }
        int s=st.size();
        int[] ans= new int[s];
        for(int i=s-1;i>=0;i--){//here we assing the result from the stack to array
            int val=st.pop();
            ans[i]=val;
        }
        return ans;
    }

    public static void main(String[] args) {
     int[] arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int [] res=remove(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(res[i]+" ");
        }
    }
}
