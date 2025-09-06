package Queue;

import java.util.LinkedList;
import java.util.Queue;

//Print the queue only use extra queue
public class basic {
    public static void main(String[] args) {
        Queue<Integer> qe=new LinkedList<>();
        qe.add(45);
        qe.add(90);
        qe.add(8);
        qe.add(7);
        qe.add(56);
        Queue<Integer> q=new LinkedList<>();
        while(!qe.isEmpty()){
            int data=qe.remove();
            System.out.print(data+" ");
            q.add(data);
        }
    }

}
