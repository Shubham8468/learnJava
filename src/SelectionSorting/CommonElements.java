package SelectionSorting;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommonElements {
    public static void print(int[] arr){
        for(int temp: arr){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static int[] sort(int[] arr){
        int n=arr.length;
        //here use selection sort
        for (int i = 0; i < n-1; i++) {
            int mindex=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[mindex]){
                    mindex=j;
                }
            }
            int temp=arr[mindex];
            arr[mindex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static ArrayList<Integer>  FindComman(int[] arr1,int[] arr2,ArrayList<Integer> ans){
        int i=0;
        int j=0;
        while(i<arr1.length &&j<arr2.length){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
       return ans;
    }
    public static void main(String[] args) {
        int[] arr1= {3, 4, 2, 2, 4};
        int[] arr2= {3, 2, 2, 7};
        ArrayList<Integer> ans=new ArrayList<>();
        sort(arr1);
        sort(arr2);
        FindComman(arr1,arr2,ans);
        System.out.println(ans);
    }
}
