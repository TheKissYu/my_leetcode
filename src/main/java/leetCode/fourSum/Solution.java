package leetCode.fourSum;

import java.util.*;

/**
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。
 * 请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]]
 * （若两个四元组元素一一对应，则认为两个四元组重复）：
 *
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        //排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if (i>0&&nums[i] == nums[i-1]){
                continue;
            }
            //最小的四个数相加就大于目标值 跳出循环
            if (target < (long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3]){
                break;
            }
            //当前值加上最大的四个值小于目标值就进行下一个数
            if (target > (long)nums[i]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]){
                continue;
            }
            for (int j = i+1; j < nums.length-2; j++) {
                if (j>i+1&&nums[j] == nums[j-1]){
                    continue;
                }
                //最小的四个数相加就大于目标值 跳出循环
                if (target < (long)nums[i]+nums[j]+nums[j+1]+nums[j+2]){
                    break;
                }
                //当前值加上最大的四个值小于目标值就进行下一个数
                if (target > (long)nums[i]+nums[j]+nums[nums.length-1]+nums[nums.length-2]){
                    continue;
                }
                int left = j+1;
                int right = nums.length - 1;
                while (left < right){
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target){
                        right --;
                    }else if (sum <target){
                        left ++;
                    }else {

                    }
                }

            }

        }

        return result;
    }
    public List<List<Integer>> fourSum1(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        Map<Integer,List<Integer>> res = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(i);
                tmp.add(j);
                res.put(nums[i]+nums[j],tmp);
            }
        }
        List<String> indexStrList = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int d = target - (nums[i] + nums[j]);
                if (res.get(d)!=null){
                    List<Integer> indexList = res.get(d);
                    if (!indexList.contains(i)&& !indexList.contains(j)){
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[indexList.get(0)]);
                        tmp.add(nums[indexList.get(1)]);
                        result.add(tmp);
                    }
                }
            }
        }
        return result;
    }
}
