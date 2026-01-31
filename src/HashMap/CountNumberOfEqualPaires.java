package HashMap;

import java.util.HashMap;

//Given a string, find the number of pairs of characters that are same.
// Pairs (s[i], s[j]), (s[j], s[i]), (s[i], s[i]), (s[j], s[j]) should be considered different.
public class CountNumberOfEqualPaires {
    long equalPairs(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        long pair=0;
        for(char ch : map.keySet()){
            long freq=map.get(ch);
            pair+=freq*freq;
        }

        return pair;
    }
}
