package leetCode.rotate1;

public class Solution {
    /**
     * 旋转整个数组
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        int n = nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,(k%n)-1);
        reverse(nums,(k%n)-1,n-1);
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = gcd(n,k);
        for (int i = 0; i < count; i++) {
            int cur = i;
            int prev = nums[i];
            do {
                //
                int next = (cur + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                cur = next;
            }while (cur != i);
        }
    }
    public static int gcd(int x, int y) {
        return y ==0 ? x:gcd(y,x%y);
    }
    public void reverse(int[] nums,  int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
}
