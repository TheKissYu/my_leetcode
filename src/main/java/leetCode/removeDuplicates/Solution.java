package leetCode.removeDuplicates;

public class Solution {
    //删除有序数组中的重复项II
    public static int removeDuplicates2(int[] nums) {
        int high = 2;
        int mid =   1;
        int count = 0;
        while (high < nums.length) {
            if (nums[high] == nums[mid] && nums[mid-1] == nums[mid]) {
                //三数相等
                count ++;
            }else {
                nums[++mid] = nums[high];
            }
            high++;
        }
        return nums.length-count;
    }
    //删除有序数组中的重复项
    public static int removeDuplicates(int[] nums) {
        int low = 0;
        int fast = 1;
        int count = 0;
        for (; fast < nums.length; fast++) {
            if (nums[low] != nums[fast]){
                nums[++low] = nums[fast];
            }else {
                count ++;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int i = removeDuplicates2(nums);
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + ",");
        }


    }
    //删除有序数组 的通解  k为出现的次数
    int process(int[] nums, int k) {
        int u = 0;
        for (int x : nums) {
            if (u < k || nums[u - k] != x){
                nums[u++] = x;
            }
        }
        return u;
    }
}
