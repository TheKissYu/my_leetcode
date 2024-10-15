package leetCode.romanToInt;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt1(String s) {
        Map<Character,Integer> romanIntMap =new HashMap<>();
        romanIntMap.put('M',1000);
        romanIntMap.put('D',500);
        romanIntMap.put('C',100);
        romanIntMap.put('L',50);
        romanIntMap.put('X',10);
        romanIntMap.put('V',5);
        romanIntMap.put('I',1);
        int sum = 0;
        int flag = 0;
        for (int i= s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            Integer integer = romanIntMap.get(c);
            if (flag > integer){
                sum-= integer;
            }else {
                sum+=integer;
            }
            flag = integer;
        }
        return sum;
    }
    public static int romanToInt(String s) {
        String[] romans= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        Map<String,Integer> romanIntMap =new HashMap<>();
        romanIntMap.put("M",1000);
        romanIntMap.put("CM",900);
        romanIntMap.put("D",500);
        romanIntMap.put("CD",400);
        romanIntMap.put("C",100);
        romanIntMap.put("XC",90);
        romanIntMap.put("L",50);
        romanIntMap.put("XL",40);
        romanIntMap.put("X",10);
        romanIntMap.put("IX",9);
        romanIntMap.put("V",5);
        romanIntMap.put("IV",4);
        romanIntMap.put("I",1);
        int sum = 0;
        int i=0;
        int j = 0;
        while (j<s.length()){
            for (int k = i;k<romans.length;k++){
                String roman = romans[k];
                int length = roman.length();
                if (j+length >=s.length() ){
                    continue;
                }
                String substring = s.substring(j, j + length);
                if (substring.equals(roman)){
                    j=j+length;
                    i=k;
                    sum+=romanIntMap.get(roman);
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "DCXXI";
        int i = romanToInt(s);
    }


}
