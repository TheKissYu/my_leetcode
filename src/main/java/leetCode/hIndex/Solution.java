package leetCode.hIndex;

public class Solution {
    public int hIndex(int[] citations) {
        int length = citations.length;
        int[] hIndexs = new int[length + 1];
        int max = 0;
        for (int i = 0; i < citations.length; i++) {
            int citation = citations[i];
            max = Math.max(max,citation);
            if (citation >= length){
                hIndexs[length] ++;
            }else {
                hIndexs[citation] ++;
            }
        }
        int start = Math.min(max,length);
        int total = 0;
        for (int i = start;i>=0;i--){
            total += hIndexs[i];
            if (total >= i) {
                return i;
            }

        }
        return 0;
    }
}
