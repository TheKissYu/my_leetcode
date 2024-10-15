package leetCode.mergeAlternately;

public class Solution {
    public static   String mergeAlternately(String word1, String word2) {
        int w1Length = word1.length();
        int w2Length = word2.length();
        char[] chars = new char[ w1Length+w2Length];
        for (int i = 0;i< w1Length;i++){
            if (i > w2Length-1){
                chars[i+w2Length] = word1.charAt(i);
            }else {
                chars[i*2] = word1.charAt(i);
            }
        }
        for (int i = 0;i< w2Length;i++){
            if (i > w1Length-1){
                chars[i+w1Length ] = word2.charAt(i);
            }else {
                chars[i*2+1] = word2.charAt(i);
            }
        }
        String word = new String(chars);
        return word;
    }

    public static void main(String[] args) {
        String word1 = "135799";
        String word2 = "2468";
        String s = mergeAlternately(word1, word2);
        String s1 = mergeAlternately(word1, word1);
        String s2 = mergeAlternately(word2, word1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
