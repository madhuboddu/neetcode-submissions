class Solution {
    public int maxProfit(int[] prices) {


        int currprofit = 0;
        int maxProfit = 0;
        int buyInd = 0;
        int sellInd = 0;

        int minbuyPrice = 99999;
        int curBp = 0;
        for(int i = 0; i < prices.length;i++){

            if(prices[i] < minbuyPrice ){

                minbuyPrice = prices[i];
                buyInd = i;
            }else if(prices[i] > minbuyPrice ){

                sellInd = i;

                currprofit = prices[sellInd] - prices[buyInd];

                if(currprofit > maxProfit){
                    maxProfit = currprofit;
                }
            }






        }
        return maxProfit;
    }
}
