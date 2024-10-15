package leetCode.maxArea;

public class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length-1;
        while (i< j){
            int areaTmp = Math.min(height[i],height[j]) * (j-i);
            if (area < areaTmp){
                area = areaTmp;
            }
            if (height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return area;
    }
}
