package leetCode.trap;

import java.util.Stack;

public class Solution {
    /**
     * 双数组
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        for (int i =1;i<height.length-1;i++){
            maxLeft[i] = Math.max(maxLeft[i-1],height[i-1]);
        }
        for (int i =height.length-2;i >= 0;i--){
            maxRight[i] = Math.max(maxRight[i+1],height[i+1]);
        }
        int sum = 0;
        for (int i =1;i<height.length-1;i++){
            sum+= (Math.min(maxLeft[i],maxRight[i])>height[i] ? Math.min(maxLeft[i],maxRight[i])-height[i] :0);
        }
        return sum;
    }

    /**
     * 双指针
     * @param height
     * @return
     */

    public int trap1(int[] height) {
        int maxLeft = 0;
        int maxRight =0;
        int left = 0;
        int right = height.length - 1;
        int sum = 0;
        while (left < right){
            if (height[left ] < height[right ]){
                maxLeft = Math.max(maxLeft,height[left ]);
                if (maxLeft > height[left]){
                    sum += (maxLeft - height[left]);
                }
                left ++;
            }else {
                maxRight = Math.max(maxRight,height[right]);
                if (maxRight > height[right]){
                    sum += (maxRight - height[right]);
                }
                right--;
            }
        }
        return sum;
    }

    /**
     *
     * @param height
     * @return
     */
    public int trap2(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0;i< height.length ;i++){
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                int currWidth = i - left - 1;
                int currHeight = Math.min(height[left], height[i]) - height[top];
                ans += currWidth * currHeight;
            }
            //进栈
            stack.push(i);
        }
        return ans;
    }
}
