package HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class lengthOfLongestSubstring_Importent {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        List<Character> list= new ArrayList<>();
        int i=0, j=0, maxLen=1;
        while(j< s.length()){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int lent =j-i;
                maxLen= Math.max(lent,maxLen);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int lent=j-i;
        maxLen=Math.max(lent,maxLen);
        return maxLen;

    }
}
