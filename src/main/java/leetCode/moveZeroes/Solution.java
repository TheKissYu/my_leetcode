package leetCode.moveZeroes;

public class Solution {
    public static void moveZeroes(int[] nums) {
        int low = 0;
        int fast = -1;
        while (low < nums.length){
            if ( ++fast < nums.length){
                if (nums[fast] !=0){
                    nums[low] = nums[fast];
                }
            }else {
                nums[low] = 0;
            }
            low++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        //1、0、3、12、12   j = 1  j = 4   l=4
        //1、3、12、12、12  j= 1   j= 3    l=2
        moveZeroes(nums);
    }
}
