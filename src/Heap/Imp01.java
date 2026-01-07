package Heap;

import java.util.PriorityQueue;

public class Imp01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);pq.add(20); pq.add(-30);
        System.out.println(pq.peek());
        pq.add(35);
        System.out.println(pq);
    }
}
