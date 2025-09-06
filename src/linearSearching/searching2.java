package linearSearching;

import java.util.Arrays;

public class searching2 {
    public static void main(String[] args) {
        int[] arr = {34, 67, 89, 59, 9, 2, 8, 3};
        int target = 0;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    //search in the arry: return the element if item found
    //otherwise if item not found return -1;
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        // check for element at every index if it is=target
        for (int element : arr) {
            // check for element at every index if it is=target
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
