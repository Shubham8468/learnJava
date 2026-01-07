package Heap;

import java.util.Collections;
import java.util.PriorityQueue;
// this is for the Find kth smallest item in Array
// Simple approach is
// First we use maxHeap
// and the size of heap is kth
// then insert the item in heap
//after this heap is full
// remove the item
// then return the peek item
public class kthSmallestElemants {
   public static int kthSmallestItem(int[] arr, int k){
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int ele : arr){// to pura time complexcity nlogk
           pq.add(ele); // add krne me logk lg rha hai bus
           if(pq.size()>k){
               pq.remove(); // logk
           }
       }
       return pq.peek();
   }
    public static int KthLargestItem(int[] arr, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                pq.remove();
            }
        }
       return pq.peek();
    }
}
// Find Kth Largest item in Array



