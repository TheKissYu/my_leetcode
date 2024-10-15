package leetCode.isPalindrome;

public class Solution {
    /**
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)){
                left ++;
            }else if (!Character.isLetterOrDigit(rightChar)){
                right --;
            }else {
                if (Character.toLowerCase(rightChar)!= Character.toLowerCase(leftChar)) {
                    return false;
                }
                left ++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
