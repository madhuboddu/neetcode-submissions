class Solution {
    public int maxProfit(int[] prices) {
        // int currprofit = 0;
        // int maxProfit = 0;
        // int buyInd = 0;

        // int minbuyPrice = 99999;
        // int curBp = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     if (prices[i] < minbuyPrice) {
        //         minbuyPrice = prices[i];
        //         buyInd = i;
        //     } else {
        //         currprofit = prices[i] - prices[buyInd];

        //         if (currprofit > maxProfit) {
        //             maxProfit = currprofit;
        //         }
        //     }
        // }
        // return maxProfit;
        int l = 0;
        int r = 1;
        int maxProfit = Integer.MIN_VALUE;
        while (r < prices.length) {
            int profit = prices[r] - prices[l];
            maxProfit = Math.max(profit, maxProfit);

            if (prices[r] < prices[l]) {
                l = r;
            }
            r++;
        }
        return maxProfit > 0 ? maxProfit : 0;
    }
}
