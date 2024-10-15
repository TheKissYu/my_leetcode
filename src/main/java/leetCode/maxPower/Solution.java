package leetCode.maxPower;

public class Solution {
    public static int maxPower(String s) {
        int n = s.length(), ans = 1;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) j++;
            ans = Math.max(ans, j - i);
            i = j;
        }
        return ans;
    }

    public static void main(String[] args) {
        int l = maxPower("abbcccddddeeeeedcba");
        System.out.println(l);

    }
}
