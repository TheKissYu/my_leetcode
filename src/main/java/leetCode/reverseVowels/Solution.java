package leetCode.reverseVowels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String reverseVowels(String s) {
        Character[] yChars = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> yCharList = Arrays.asList(yChars);
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        boolean leftFlag = false;
        boolean rightFlag = false;
        while (i< j){
            if (yCharList.contains(chars[i])){
                leftFlag = true;
            }
            if (yCharList.contains(chars[j])){
                rightFlag = true;
            }
            if (!leftFlag){
                i++;
            }
            if (!rightFlag){
                j--;
            }
            if (leftFlag&&rightFlag){
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                leftFlag = false;
                rightFlag = false;
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s ="leetcode";
        String s1 = reverseVowels(s);
        System.out.println(s1);
    }
}
