package HashMap;

import java.util.HashMap;

// Approach :-
// First we create two hashMap
// than store array in that
// than compaire with each other if hashmap not contains this key return false;
public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> amap=new HashMap<>();
        for(int ele : a){
            if(amap.containsKey(ele)){
                int freq= amap.get(ele);
                amap.put(ele,freq+1);
            }
            else{
                amap.put(ele,1);
            }
        }
        HashMap<Integer,Integer> bmap= new HashMap<>();
        for(int ele : b){
            if(!amap.containsKey(ele)){// yaha check kr lege ki b arr me koi asa num to nhi hai na jo a ke contains nhi krta
                return false;
            }
            if(bmap.containsKey(ele)){
                int freq=bmap.get(ele);
                bmap.put(ele,freq+1);
            }
            else{
                bmap.put(ele,1);
            }
        }
        for(int ele : bmap.keySet()){
            int freq= bmap.get(ele);
            int aFreq= amap.get(ele);
            if(aFreq< freq){
                return false;
            }
        }
        return true;
    }
}
