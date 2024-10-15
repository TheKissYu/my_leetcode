package leetCode.candy;

public class Solution {
    public static int candy2(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
            System.out.print(left[i] + ",");
        }
        System.out.println();
        int right = 0, ret = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            System.out.print(Math.max(right,left[i])+",");
            ret += Math.max(left[i], right);

        }
        return ret;
    }
    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        candies[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i-1] < ratings[i]) {
                candies[i] = candies[i-1] + 1;
            }else {
                candies[i] = 1;
            }
            System.out.print(candies[i] + ",");
        }
        System.out.println();
        int right = 1;
        int sum =  candies[ratings.length-1];
        for (int i = ratings.length-2; i >=0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            System.out.print(Math.max(right,candies[i])+",");
            sum += Math.max(right,candies[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,2,1};
        candy2(nums);
        System.out.println();
        candy(nums);
    }
}
