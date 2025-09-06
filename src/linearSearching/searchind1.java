package linearSearching;

public class searchind1 {
    public static void main(String[] args) {
        int[] arr={34,67,89,59,9,2,8,3};
        int target=0;
        int ans=linearSearch(arr,target);
        System.out.println(ans);
    }

    //search in the arry: return the index if item found
    //otherwise if item not found return -1;
    static int linearSearch(int[] arr,int target){
       if(arr.length==0){
           return -1;
       }
       //run a for loop
       for(int index=0;index<arr.length;index++){
           // check for element at every index if it is=target
           int element=arr[index];
           if(element==target){
               return index;
           }
       }
       return -1;
    }
}

