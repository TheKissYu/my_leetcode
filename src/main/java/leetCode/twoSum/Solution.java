package leetCode.twoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            }else if (sum < target) {
                left ++;
            }else {
                right --;
            }
        }
        return new int[]{-1,-1};
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> dataMap = new HashMap<>();
        int[] targetArray = new int[2];
        for (int i = 0;i<nums.length;i++){
            int data=nums[i];
            int otherData = target - data;
            if (dataMap.containsKey(otherData)){
                targetArray[0] = dataMap.get(otherData);
                targetArray[1] = i;
            }
            dataMap.put(nums[i],i);
        }
        return targetArray;
    }
}
