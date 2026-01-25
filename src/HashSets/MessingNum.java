package HashSets;

import java.util.HashSet;

//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.
public class MessingNum {
    public int missingNumber(int[] arr) {
     int n= arr.length;
        HashSet<Integer> set= new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
