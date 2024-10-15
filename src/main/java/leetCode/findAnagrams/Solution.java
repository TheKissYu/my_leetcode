package leetCode.findAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    /**
     * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
     * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int pl = p.length();
        int sl = s.length();
        if (pl<=sl){
            int[] sArray = new int[26];
            int[] pArray = new int[26];
            for (int i = 0; i < p.length(); i++) {
                ++pArray[p.charAt(i)-'a'];
                ++sArray[s.charAt(i)-'a'];
            }
            int left = 0;
            if (Arrays.equals(sArray,pArray)){
                result.add(0);
            }
            while (left<(s.length() - p.length())){
                --sArray[s.charAt(left)-'a'];
                ++sArray[s.charAt(left+pl) - 'a'];
                if (Arrays.equals(sArray,pArray)){
                    result.add(left+1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        findAnagrams1("cbaebabacd","abc");
    }
    public static List<Integer> findAnagrams1(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int sl = s.length();
        int pl = p.length();
        int[] countArr =new int[27];
        int diff = 0;
        for(int i=0;i<pl;i++){
            --countArr[p.charAt(i)- 'a'];
            ++countArr[s.charAt(i)- 'a'];
        }
        for(int i=0;i<27;i++){
            if(countArr[i]!=0){
                diff++;
            }
        }
        if(diff == 0){
            res.add(0);
        }
        for(int i = 0; i < sl - pl; i++){
            if(countArr[s.charAt(i)-'a']==1){
                --diff;
            }else if(countArr[s.charAt(i)-'a']==0){
                ++diff;
            }
            //减去  所以上面要判断是否是 从一变为0 以及从0变为-1
            countArr[s.charAt(i)-'a']--;
            if(countArr[s.charAt(i+pl)-'a']==0){
                diff ++;
            }else if(countArr[s.charAt(i+pl)-'a']==-1){
                diff --;
            }
            countArr[s.charAt(i+pl)-'a']++;
            if(diff == 0){
                res.add(i+1);
            }
        }
        return res;

    }
}
