package Stack;
//leetcode 84
//Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
// return the area of the largest rectangle in the histogram.
//means we return tha largest wait hidtogrsm bar
//      Approach

import java.util.Stack;

//  1. we find the previous small elemant for each item which is present in arr
//     we know that first element have no previous small items so that we put there n{lenght of arr};
//  2. than we find the next smaller element for each item .
//     we know that last item have no next smaller item so that we put -1;
//
public class histogramsbar84 {
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};//Given histogram bar
        int n=arr.length;
        Stack<Integer> st =new Stack<>();
        int[] pse=new int[n];
        int[] nse=new int[n];
        //find the next small items;
        st.push(n-1);
        nse[n-1]=n;
        for (int i = n-2; i >0 ; i--) {
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.size()==0){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(i);

        }
        //remove all items forme the stack;
        //And put the pse ;
       while(st.size()>0){
           st.pop();
       }
       //Find the pse
        st.push(0);
       pse[0]=-1;
        for (int i = 1; i < n; i++) {
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.size()==0){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);

        }
        int max=-1;
        for (int i = 0; i < n; i++) {
            int area=arr[i]*(nse[i]-pse[i]-1);
            max=Math.max(area,max);

        }
        System.out.print("this is answer: ");
        System.out.println(max);
    }

}
