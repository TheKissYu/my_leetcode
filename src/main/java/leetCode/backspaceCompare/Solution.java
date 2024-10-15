package leetCode.backspaceCompare;

import java.sql.Array;
import java.util.ArrayList;

public class Solution {
    public static boolean backspaceCompare(String s, String t) {
        int tMove = t.length() - 1;
        int sMove = s.length() - 1;
        while ( tMove >= 0 || sMove>=0){
            tMove = move(t,tMove);
            sMove = move(s,sMove);
            char tChar = t.charAt(tMove);
            char sChar = s.charAt(sMove);
            if (tMove>=0&&sMove>=0){
                if (tChar !=sChar){
                    return false;
                }
            }else {
                if (tMove>=0||sMove>=0){
                    return false;
                }
            }
            tMove --;
            sMove --;
        }

        return true;
    }

   static int move(String t,int tMove){
       int tFlag = 0;
       while ( tMove >= 0 ){
            char tChar = t.charAt(tMove);
            if ( tChar == '#' ){
                tFlag ++;
                -- tMove;
            }else {
                if (tFlag > 0){
                    -- tFlag;
                    -- tMove;
                }else {
                    break;
                }
            }
        }
        return tMove;
    }
    public static void main(String[] args) {

        System.out.println(backspaceCompare("xywrrmp"
                ,"xywrrmu#p"));
    }
    static String process(String t){
        int tMove = t.length() - 1;
        String result = "";
        int tFlag = 0;
        while ( tMove >= 0 ){
            char tChar = t.charAt(tMove);
            if ( tChar == '#' ){
                tFlag ++;
                -- tMove;
            }else {
                if (tFlag > 0){
                    -- tFlag;
                    -- tMove;
                }else {
                    result +=tChar;
                }
            }
        }
        return  result;
    }
}
