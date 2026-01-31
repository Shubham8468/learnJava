package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class tryLeetcode {
    public boolean isAnagram(String s1, String s2) {
      HashMap<Character,Integer> map= new HashMap<>();
      int l1= s1.length();
      int l2= s2.length();
      if(l1!=l2)return false;
      for(int i=0;i<l1;i++){
          char ch=s1.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
      }
      for(int i=0;i<l2;i++){
          char ch =s2.charAt(i);
          if(!map.containsKey(ch))return false;
          int freq=map.get(ch);
          if(freq==0)return false;
          map.put(ch,freq-1);
      }
      return true;

    }























    public boolean isAnagram1(String s1, String s2) {
     int l1= s1.length();
     int l2=s2.length();
     if(l1!=l2){
         return false;
     }
        HashMap<Character,Integer> map1=new HashMap<>();
     for(int i=0;i<l1;i++){
         char ch = s1.charAt(i);
         if(map1.containsKey(ch)){
             int freq= map1.get(ch);
             map1.put(ch,freq+1);
         }
         else{
             map1.put(ch,1);
         }
     }
     HashMap<Character,Integer> map2= new HashMap<>();
     for(int i=0;i<l2;i++){
         char ch = s2.charAt(i);
         if(!map1.containsKey(ch))return false;

         if(map2.containsKey(ch)){
             int freq= map2.get(ch);
             map2.put(ch,freq+1);
         }
         else{
             map2.put(ch,1);
         }
     }
      for( char ch : map2.keySet()){
          int freq1= map1.get(ch);
          int freq2= map2.get(ch);
          if(freq2< freq1){
              return false;
          }
      }
      return true;
    }

    public int lengthOfLongestSubstring(String s) {
        List<Character> l= new ArrayList<>();
        int end=0, min =0, maxlen=0;
        while (end<s.length()){
            char ch=s.charAt(end);
            if(!l.contains(ch)){
                int len=l.size();
                l.add(ch);
                end++;
                maxlen=Math.max(len,maxlen);
            }
            else{
                l.remove(Character.valueOf(s.charAt(min)));
                min++;
            }
        }
       return maxlen;
    }

}

