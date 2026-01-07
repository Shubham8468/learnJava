package Heap;

import java.util.PriorityQueue;

public class KthShortArrayGFG {
    public static void KthShoretArray(int[] arr, int k){
//        TC=o(nlog k)
        // AS o(k)




        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int idx=0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                arr[idx++]=pq.remove();
            }
        }
        // this for the kth last items
        while(pq.size()!=0){
            arr[idx++]=pq.remove();
        }
    }
}
