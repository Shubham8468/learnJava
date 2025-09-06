package Queue.Question;
import java.util.*;
public class reversIt {
    public static void main(String[] args) {
        Queue<Integer> qe=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        qe.add(34);
        qe.add(90);
        qe.add(3);
        qe.add(9);
        qe.add(54);
        qe.add(60);

        System.out.println(qe);
        while (!qe.isEmpty()){
            st.push(qe.remove());
        }
        while (!st.isEmpty()){
            qe.add(st.pop());
        }
        System.out.println(qe);
    }
}
