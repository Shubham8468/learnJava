package BinarySearching;

public class searchInDescendingOrder {
    public static void main(String[] args) {
        int[] arr={100,91,87,76,66,52,43,35,29,13,5};
        int target=100;
        int lo=0;
        int hi= arr.length-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(target>arr[mid]){
                hi=mid-1;
            }
            else if (target<arr[mid]){
                lo=mid+1;
            }
            else{
                System.out.println("Index of the item is :"+mid);
                return;
            }
        }
        System.out.println("items is not present in the array!");
    }
}
