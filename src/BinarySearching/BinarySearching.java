package BinarySearching;

import java.util.*;
public class BinarySearching {

    //Basic of binary Searching...

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the item: ");
        int item=sc.nextInt();
        int n=num.length;
        int lo=0;
        int hi=n-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(num[mid]==item){
                System.out.println("item is present in the arr and its index is :"+mid);
                return;
            } else if (item>num[mid]) {
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println("item is not present in there!");

    }
}
