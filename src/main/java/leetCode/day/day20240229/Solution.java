package leetCode.day.day20240229;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        int length = nums.length;
        for (;fast < nums.length ;fast ++){
            if (val != nums[fast]){
                nums[slow] = nums[fast];
                slow++;
            }else {
                length --;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
        System.out.println(nums.toString());
    }
}
