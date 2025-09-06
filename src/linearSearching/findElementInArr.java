package linearSearching;

public class findElementInArr {
    //Find mim element in arr
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        System.out.println(findElement(arr ));
    }
    static int findElement(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int idx=0;//for the point the oth idex of the array
        int ans=0;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[idx]<arr[i]){
                 ans=arr[idx];
            }
            else{
                idx++;
            }
        }
        return ans;

    }
}
