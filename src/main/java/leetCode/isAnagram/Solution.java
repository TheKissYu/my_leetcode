package leetCode.isAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < sLength ; i++) {
            int count = map.get(s.charAt(i)) == null ? 0 : map.get(s.charAt(i));
            map.put(s.charAt(i),count);
        }
        for (int i = 0; i < tLength ; i++) {
            int count = map.get(t.charAt(i))== null ? 0 : map.get(t.charAt(i)) ;
            if (count > 0){
                map.put(t.charAt(i),--count);
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String t = "anagram";
        String s = "nagaram";
        boolean anagram = isAnagram(s, t);
    }
}
