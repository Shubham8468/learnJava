package linearSearching;

public class Try {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        System.out.println(search(1,4,arr,3));
    }
    static boolean search(int start,int last,int[] arr,int target){
        if(last==0){
            return false;
        }
        for (int i = start; i <=last ; i++) {
            int item=arr[i];
            if(item==target){
                return true;
            }

        }
        return false;

    }
}
