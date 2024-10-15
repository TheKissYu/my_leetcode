package leetCode.merge;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int flag = m+n - 1;
        --m ;
        --n;
        while(m>=0||n>=0){
            if (m == -1) {
                nums1[flag] = nums2[n--];
            } else if (n == -1) {
                nums1[flag] = nums1[m--];
            } else if(nums1[m] > nums2[n]){
                nums1[flag] = nums1[m--];
            }else{
                nums1[flag] = nums2[n--];
            }
            flag --;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        merge(nums1,0,nums2,1);
    }
}
