package leetCode.rotate;

public class Solution {
    /**
     * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int count = gcd(n,k);
        //
        for (int i = 0; i < count; i++) {
            int cur=i;
            int prev=nums[cur];
            do{
                int next=(cur+k)%n;
                int temp=nums[next];
                nums[next]=prev;
                prev = temp;
                cur = next;
            }while(i!=cur);
        }
    }

    /**
     * 辗转相除 求公约数
     * @param x
     * @param y
     * @return
     */
    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

}
