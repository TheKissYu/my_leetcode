package leetCode.reverseWords;

public class Solution {
    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=s1.length-1;i>=0;i--){
            if (!s1[i].equals(" ") && !s1[i].equals("") ){
                stringBuilder.append(s1[i]);
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString().trim();
    }
    public static String reverseWords1(String s) {
        int index = s.length()-1;
        int left = index;
        int right = index;
        StringBuilder sb= new StringBuilder();
        while(index >=0){
            if (s.charAt(index) == ' ' || index == 0){
                left = index;
                StringBuilder chars = new StringBuilder();
                while (left <= right){
                    if (s.charAt(left) !=' '){
                        chars.append(s.charAt(left));
                    }
                    left ++;
                }
                if (sb.length() >0 && chars.length() >0){
                    sb.append(" ");
                }
                sb.append(chars);
                right = index;
            }
            index --;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords1("the sky is blue"));
    }
}
