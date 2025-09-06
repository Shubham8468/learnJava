package linearSearching;

public class FindMaxElementInArr {
    public static void main(String[] args) {
        int[] arr={18,12,-7,93,14,8};
        System.out.println(findElement(arr ));
    }
    static int findElement(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int idx=0;//for the point the oth idex of the array
        int ans=0;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[idx]>arr[i]){
                ans=arr[idx];
            }
            else{
                ans=arr[i];
                idx++;
            }
        }
        return ans;

    }
}
