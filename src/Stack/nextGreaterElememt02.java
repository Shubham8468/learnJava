package Stack;

import java.util.*;
//this method is more efficient if i compaire the array method
//Here no need extrea space
//And time complexty is O(n)
public class nextGreaterElememt02 {
    public static int[] answer(int[] arr){
        int le=arr.length;
        int[] res=new int[le];//this arr use for the store  final answer
        Stack<Integer> st=new Stack<>();//in stack we push the last secound item from the arr
        st.push(arr[le-1]);//here we seen the last item are by defult push in the stack becous we knoew that last item
        res[arr[le-1]]=st.peek(); //have no nextGreateritem
       // res[arr[le-1]]=st.peek();//As by defult set the -1
        for(int i=le-2;i>=0;i--){//push the items from the last secoud from the arr
            while(st.peek()<arr[i]&&st.size()>=0){//in this we check the stack peek item if its is less than the arr item
                //and also check the stack size;
                st.pop();//here we pop the item from the stack
                //becous we find the nextGreateeItem
                if(st.size()==0){
                    break;
                }
            }
            if(st.size()==0)res[i]=-1;//if while loop hits and the size of stack is 0 in case no greater item
            //in case we set by defult -1
            else{
                res[i]=st.peek();//if statemant not hit
                //its means st peek is greater item so we this item inser in res
            }
            st.push(arr[i]);//its is mendetory to stor
        }
        res[arr[le-1]]=st.peek();

        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int[] ans=answer(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
