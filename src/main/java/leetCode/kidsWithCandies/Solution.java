package leetCode.kidsWithCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i =0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        List<Boolean> list = new ArrayList<>();
        for (int i =0;i<candies.length;i++){
            list.add(max <= candies[i] + extraCandies);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] c = {2,3,5,1,3};
        kidsWithCandies(c,3);
    }
}
