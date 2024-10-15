package leetCode.sortedSquares;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] squares = new int[nums.length];
        int index = nums.length - 1;
        while (left <= right){
            int leftNum = Math.abs(nums[left]);
            int rightNum = Math.abs(nums[right]);
            int square ;
            if (leftNum < rightNum){
                square = rightNum * rightNum;
                right -- ;
            }else {
                square = leftNum * leftNum;
                left ++;
            }
            squares[index ++] = square;
        }
        return squares;
    }
}
