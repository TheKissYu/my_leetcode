package work;

public class Solution {
    public static void main(String[] args) {
        int[]  pxList = {10,20,40,30,50,30,20};
        st(100,pxList,0);
    }
    public static void st(int si,int[]  pxList,int surplusRow){
        int sum = 0;
        for (int i = 0; i < pxList.length; i++) {
            sum+=pxList[i];
        }
        int row = surplusRow;
        if (si - row < sum){
            int leftIndex = 0;
            int rightIndex = 0;
            while (rightIndex < pxList.length){
                int tmp = pxList[rightIndex];
                System.out.print("leftIndex="+leftIndex);
                System.out.print("rightIndex="+rightIndex);
                System.out.print("tmp="+tmp);
                System.out.println("row="+row);
                if (si-row < tmp){

                    leftIndex = rightIndex;
                    row = 0;
                }else {
                    row = row + tmp;
                    rightIndex ++;
                }
            }
        }
    }
}
