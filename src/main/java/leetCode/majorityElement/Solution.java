package leetCode.majorityElement;

public class Solution {
    //给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    public int majorityElement(int[] nums) {
        int count = 1;
        int flag = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (flag == num) {
                count++;
            }else {
                if(count == 0){
                    flag = num;
                    count ++;
                }else {
                    count -- ;
                }
            }
        }
        return flag;
    }
}
