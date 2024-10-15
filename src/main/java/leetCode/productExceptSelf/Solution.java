package leetCode.productExceptSelf;

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] returnNum = new int[length];
        returnNum[0] = 1;
        for (int i=1;i<length;i++){
            returnNum[i] = returnNum[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i=length-2;i>=0;i--){
            returnNum[i] = returnNum[i] * right;
            right*=nums[i];
        }

        return returnNum;
    }

    public static void main(String[] args) {
        int[] num= {1,2,3,4};
        productExceptSelf(num);
    }
}
