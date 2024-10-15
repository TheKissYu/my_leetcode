package leetCode.reverseStr;

public class Solution {
    public String reverseStr(String s, int k) {
        int flag = k;
        int index = 0;
        String res = "";
        char[] tmp = new char[k];
        while (index < s.length()){
            if (flag == 0){
                flag  = k;
                index +=k;
            }

            flag -- ;
            index ++;
        }
        return null;
    }
}
