package leetCode.intersection;

import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> countMap = new HashMap<>();
        int min = Math.min(nums1.length, nums2.length);
        int[] res = new int[min];
        for (int i = 0; i < nums1.length; i++) {
            countMap.put(nums1[i],1);
        }
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            Integer integer = countMap.get(nums2[i]);
            if (integer!=null){
                res[index++] = nums2[i];
            }
        }
        return Arrays.copyOfRange(res, 0, index-1);
    }

}
