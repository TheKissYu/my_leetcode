package leetCode.lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长
 * 子串
 *  的长度。
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (map.containsKey(s.charAt(i))){
                //确定左边界
                left = Math.max(left,map.get(s.charAt(i)) );
            }
            map.put(s.charAt(i),i);
            max = Math.max(i-left,max);
        }
        return max;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring(" ");
    }
}
