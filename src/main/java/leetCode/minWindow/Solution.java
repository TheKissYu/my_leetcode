package leetCode.minWindow;


public class Solution {
    public static String minWindow(String s, String t) {
        int[] need = new int[52];
        for (int i= 0;i<t.length();i++){
            need[getNeedIndex(t.charAt(i))] ++;
        }
        int left = 0;
        int right = 0;
        int start = 0;
        int size = Integer.MAX_VALUE;
        int tLength = t.length();
        while (right < s.length()){
            char c = s.charAt(right);
            if (need[getNeedIndex(c)] >0){
                tLength --;
            }
            need[getNeedIndex(c)] -- ;
            if (tLength <= 0){
                while (right >= left){
                    if (right-left + 1< size){
                        start = left;
                        size = right-left + 1;
                    }
                    if (++need[getNeedIndex(s.charAt(left ++))] > 0){
                        ++ tLength;
                        break;
                    }
                }

            }
            right ++;
        }
        return size == Integer.MAX_VALUE ?"":s.substring(start,start + size);
    }
    static int getNeedIndex(char x){
        return x >= 'A' && x <= 'Z' ? x - 'A' + 26 : x - 'a';
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        System.out.println(minWindow(s,t));
    }
}
