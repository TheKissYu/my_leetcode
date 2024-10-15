package leetCode.canJump;

public class Solution {
    public boolean canJump(int[] nums) {
        int flag = 0;
        for (int i=0;i<nums.length;i++){

            if (flag < i){
                return false;
            }
            flag = Math.max(flag,nums[i] + i);
        }
        return true;
    }
    public int jump(int[] nums) {
        int flag = 0;
        int step = 0;
        int lastJumpPoint = 0;
        for (int i=0;i<nums.length;i++){
            flag = Math.max(flag,nums[i] + i);
            if (i==lastJumpPoint){
                step ++;
                lastJumpPoint = flag ;
            }
        }
        return step;
    }
}
