package Queue;
//it must be  in even order ..
/* Step1: Move First half to stack
   Stap2: Empty st to queue
   Step3: Move 1st(2nd) half to stack
   Step4: One by one add
 */
import java.util.*;
//Finla Answer:- 1,5,2,6,3,7,4,8
public class reorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();//1,2,3,4,5,6,7,8
        Stack<Integer> st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int si=q.size()/2;
        for (int i = 1; i <=si ; i++) {
            st.push(q.remove());
        }
        //Queue [5,6,7,8]
        //Stack [4,3,2,1]
        while(st.size()>0){
            q.add(st.pop());
        }// queue [5 6 7 8 4 3 2 1]
        for (int i = 1; i <=si ; i++) {
            st.push(q.remove());
        }
        // Queue [4,3,2,1]
        // Stack [5,6,7,8,]
        for (int i = 1; i <=si ; i++) {
            q.add(st.pop());
            q.add(q.remove());
        }
        // Queue [8,4,7,3,6,2,5,1]
        //Now we revers it with the help of stack
        System.out.println(q);
        while(q.size()>0) {
            st.push(q.remove());
            
        }

            while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
