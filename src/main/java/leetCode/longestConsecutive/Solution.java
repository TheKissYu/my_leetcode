package leetCode.longestConsecutive;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,1);
        }
        int maxSize = 0;
        for (int i=0;i<nums.length;i++){
            int num = nums[i];
            int pre = num - 1;
            int last = num + 1;
            while (map.containsKey(pre)){
                map.remove(pre);
                pre --;
            }
            while (map.containsKey(last)){
                map.remove(last);
                last --;
            }
            maxSize = Math.max(maxSize,last - pre - 1);
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int[] num = {100,4,200,1,3,2};
        int i = longestConsecutive(num);

    }
}
