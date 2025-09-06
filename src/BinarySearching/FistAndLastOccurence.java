package BinarySearching;
//here we find first and last Occurence and give its index;
public class FistAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6,};
        int[] ans=new int[2];
        int target=1;
        int first=findFirst(arr,target);
        int last=findLast(arr,target);
        ans[0]=first;
        ans[1]=last;
        for(int i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int findFirst(int[] arr,int target){
        int n= arr.length;
        int lo=0;
        int hi=n-1;
        int idx=-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
            if(arr[mid]==target){
                idx=mid;
                hi=mid-1;
            }
        }
        return idx;
    }
   public static int findLast(int[] arr,int target){
        int n= arr.length;
        int lo=0;
        int hi=n-1;
        int idxe=-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
            if(arr[mid]==target){
                idxe=mid;
            }
        }
        return idxe;
    }

}
