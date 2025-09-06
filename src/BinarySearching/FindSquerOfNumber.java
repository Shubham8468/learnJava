package BinarySearching;
import java.util.*;
//in this give a number and find it squer;
//no squer find then give the nearest squer;
public class FindSquerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        int lo=0,hi=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid==n/mid){
                System.out.println(mid+" is the squer of "+n);
                return ;
            }
            else if(mid>n/mid){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(hi+" is the neaest squer of the "+n);
        return ;

    }
}
