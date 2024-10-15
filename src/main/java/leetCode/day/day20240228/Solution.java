package leetCode.day.day20240228;


import java.util.HashMap;

public class Solution {
    public static int index0(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length-1;
        int mid = 0;
        int index = -1;
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        while (right >= left){
            mid= (right+left) /2;
            if (target == nums[mid]){
                index = mid;
            }
            if (target < nums[mid]){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return index;
    }
    public static int index(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length-1;
        int mid = 0;
        int index = -1;
        while (right >= left){
            mid= (right+left) /2;
            if (target == nums[mid]){
                index = mid;
            }
            if (target > nums[mid]){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1};
        System.out.println(index(nums,1));
        System.out.println(index0(nums,1));
    }


}
