package leetCode.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        //排序
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        if (nums != null && nums.length >= 3){
            //三个数  所以第一个数最大从倒数第三个数开始
            for (int first = 0;first < nums.length -2 ;first ++){
                // 需要和上一次枚举的数不相同
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                //三个数中的第一个数如果大于0就不可能相加为0；
                if (nums[first] > 0){
                    break;
                }
                int second = first +1;
                if (nums[first] + nums[second] >0){
                    break;
                }
                int third = nums.length - 1;
                int target = -nums[first];
                while (second < third){
                    boolean secondMove = false;
                    boolean thirdMove = false;
                    int otherTarget = nums[second] + nums[third];
                    if (target == otherTarget ){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        ans.add(list);
                        //相等 左右两侧都移动
                        second ++ ;
                        third --;
                        secondMove = true;
                        thirdMove = true;
                    }else if (target > otherTarget){
                        second ++;
                        secondMove = true;
                    }else {
                        third --;
                        thirdMove = true;
                    }
                    if (secondMove){
                        while (second < third && nums[second -1] == nums[second]){
                            second ++;
                        }
                    }
                    if (thirdMove){
                        while (second < third && nums[third +1] == nums[third]){
                            third --;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        threeSum(nums,0);
    }

    /**
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums,int target) {
        // 三数相加等于 目标值
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        if (nums != null && nums.length >= 3){
            for (int first = 0;first < nums.length -2 ;first ++){
                //去除重复的值
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                int second = first +1;
                int third = nums.length - 1;
                while (second < third ){
                    int sum = nums[first] + nums[second] + nums[third];
                    if (second > first + 1 && nums[second] == nums[second - 1] || sum < target) {
                        second ++;
                        continue;
                    }
                    if (nums[third] == nums[third - 1] || sum > target) {
                        third --;
                        continue;
                    }
                    if (sum == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        ans.add(list);
                        second ++;
                        third --;
                    }
                }
            }
        }
        return ans;
    }
}
