package leetCode.convert;

public class Solution {
    public static String convert(String s, int numRows) {
        if(numRows < 2) return s;
        StringBuilder[] sbs =new StringBuilder[numRows];
        int flag = -1,index=0;
        for (int i=0;i<s.length();i++){
            if (sbs[index] == null){
                sbs[index] = new StringBuilder();
            }
            sbs[index].append(s.charAt(i));
            if (index == numRows-1 || index == 0){
                flag = -flag;
            }
            index = index + flag;
        }
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<numRows;i++){
            if (sbs[i] !=null && sbs[i].length() >0 ){
                sb.append(sbs[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING",3);
    }
}
