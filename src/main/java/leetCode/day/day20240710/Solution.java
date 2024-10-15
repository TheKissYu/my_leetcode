package leetCode.day.day20240710;

import leetCode.util.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Integer lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if (map.containsKey(c)) {
               left = Math.max(left, map.get(c) + 1);
           }
           map.put(c, i);
           maxLength = Math.max(maxLength, i - left + 1);
       }
       return maxLength;
    }

    /**
     *  1-2-3-4
     * 1. 1-null pre = 1
     * 2. 2-1
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while (curr != null) {
           ListNode next = curr.next;
           curr.next = prev;
           prev = curr;
           curr =next;
       }
       return prev;
    }
}
