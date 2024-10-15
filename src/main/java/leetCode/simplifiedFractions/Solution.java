package leetCode.simplifiedFractions;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 给你一个整数 n ，请你返回所有 0 到 1 之间（不包括 0 和 1）满足
     * 分母小于等于  n 的 最简 分数 。分数可以以 任意 顺序返回。
     * @param n
     * @return
     */
    public static List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for (int i=2;i<=n;i++){
            for (int j=1;j<i;j++){
                if (gcd(i,j) == 1){
                    list.add(j+"/"+i);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
//        int gcd = gcd(90, 9);
//        System.out.println(gcd);
        List<String> strings = simplifiedFractions(4);
        System.out.println(strings);
    }
    public static int gcd(int a,int b ){
        return b==0?a:gcd(b,a%b);
    }
}
