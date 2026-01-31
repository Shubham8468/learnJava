package HashMap;

import java.util.HashMap;

//
public class PairsWithDifference {
    int countPairs(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int paires=0; // 1 1 1 1 1 1 4 4 4 4 1 -2 -2 k=3;
        for(int ele : map.keySet()){
            int rem1= ele-k;
            int rem2= ele+k;
            if(map.containsKey(rem1)) paires+=(map.get(ele))*(map.get(rem1));
            if(map.containsKey(rem2)) paires+=(map.get(ele))*(map.get(rem2));

        }
        paires/=2;
        return paires;
    }
}
