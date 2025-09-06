package BinarySearching;
//here we find the mounten item in array
// like-> 5,6,7,8,9,4,3,2,1;
//Mounten item is 9.
public class FindMountenItem {
    public static void main(String[] args) {
        int[] arr={4,6,7,8,4,3,2,1,0};
        int n= arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
                System.out.println(" mountain item in arr is :"+arr[mid]);
                return ;
            } else if (arr[mid]<arr[mid-1]) {
                hi=mid;
            }
            else{
                lo=mid;
            }
        }
    }
}
