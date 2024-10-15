package leetCode.minSubArrayLen;

public class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0 ;
        int subLen = nums.length + 1;
        int sum = 0;
        for (int i = 0;i<nums.length;i++){
            sum =sum + nums[i];
            while (sum  >= target){
                subLen = Math.min(subLen,i-left + 1);
                sum = sum - nums[left] ;
                left ++ ;
            }
            System.out.println("sum:"+sum);
            System.out.println("left:"+left);
            System.out.println("i:"+i);
            System.out.println("subLen:"+subLen);
            System.out.println("------------");
        }
        return subLen > nums.length ? 0: subLen;
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int i = minSubArrayLen(11, n);
    }
}
