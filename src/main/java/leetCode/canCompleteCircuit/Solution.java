package leetCode.canCompleteCircuit;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int gapIndex = -1;
        for (int i=0;i<length;i++){
            int sum = 0;
            if ( gas[i] - cost[i] < 0 || gas[i] == 0){
                continue;
            }
            for (int j=i;j<length+i;j++){
                int index = j % length;
                sum += (gas[index]-cost[index]);
                if (sum < 0){
                    i = j;
                    break;
                }
            }
            if (sum >= 0){
                gapIndex = i;
            }
        }
        return gapIndex;
    }
}

