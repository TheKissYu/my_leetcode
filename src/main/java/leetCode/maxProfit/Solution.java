package leetCode.maxProfit;

public class Solution {
    /**
     * 买卖股票的最佳时机 I
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1;i<prices.length;i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] - minPrice);
        }
        return maxProfit;
    }

    /**
     * 买卖股票的最佳时机 II - 暴力检索
     * @param prices
     * @return
     */
    public  int maxProfit2(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        int dfs = dfs(prices, false, 0, 0);
        return dfs;

    }

    /**
     *  遍历节点
     * @param prices
     * @param isHave
     * @param lastProfit
     * @param index
     * @return
     */
    private  int dfs(int[] prices,boolean isHave,int lastProfit,int index){
        if (index == prices.length){
            return lastProfit;
        }
        //保持原来的
        int profit1 = dfs(prices,isHave,lastProfit,index+1);
        int profit2=0;
        if (isHave){
            profit2 = lastProfit + prices[index];
        }else {
            profit2 = lastProfit - prices[index];
        }
        //买入或卖出
        profit2=dfs(prices,!isHave,profit2,index+1);
        return Math.max(profit2,profit1);
    }

    /**
     * 买卖股票的最佳时机 II - 动态规划
     * @param prices
     * @return
     */
    public  int maxProfit3(int[] prices) {
        int[] get = new int[prices.length];
        int[] no = new int[prices.length];
        //持有股票的数组
        get[0] = -prices[0];
        //不持有股票的情况
        no[0] = 0;
        for (int i= 1;i<prices.length;i++){
            get[i] = Math.max(get[i-1],no[i-1] -prices[i]);
            no[i] = Math.max(get[i-1] + prices[i],no[i-1]);
        }
        return no[prices.length - 1];
    }

    /**
     * 买卖股票的最佳时机 II - 动态规划优化
     * @param prices
     * @return
     */
    public  int maxProfit4(int[] prices) {
        int get = -prices[0];
        int no = 0;
        for (int i= 1;i<prices.length;i++){
            get = Math.max(get,no -prices[i]);
            no = Math.max(get + prices[i],no);
        }
        return no;
    }

    /**
     * 买卖股票的最佳时机 III
     *  状态转移
     *   1. 当前状态 持有 交易次数 1
     *      ---> a.之前买了 这次卖出 b.之前买的之前卖出
     *   2. 当前状态 持有 交易次数 2 --->
     *   3. 当前状态 没有 交易次数 1 --->
     *   4. 当前状态 没有 交易次数 2 --->
     * @param prices
     * @return
     */
    public int maxProfit5(int[] prices) {
        return maxProfit(2,prices);
    }

    /**
     *
     * @param k
     * @param prices
     * @return
     */
    public static int maxProfit(int k ,int[] prices) {
        int[] buy = new int[k+1];
        int[] sell = new int[k+1];
        for (int i=0;i<=k;i++){
            buy[i] = -prices[0];
            sell[i] = 0;
        }
        for (int i=1;i<prices.length;i++){
            for (int j=1;j<=k;j++){
                //今天买  或者是 昨天之前买的
                buy[j]=Math.max(buy[j],sell[j-1] - prices[i]);
                //今天卖 第j次卖buy[j] + prices[i] 或者是之前卖的
                sell[j]=Math.max(sell[j],buy[j] + prices[i]);
            }
        }
        return sell[k];
    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        int profit = maxProfit(2, prices);
    }
}
