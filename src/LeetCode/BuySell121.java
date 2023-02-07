/*
package LeetCode;

public class BuySell121 {
}
// [7,1,5,3,6,4]


class Solution {
    public int maxProfit(int[] prices) {
        int leastSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;
        int dailyProfit = 0;

        for (int price : prices) {
            if (price < leastSoFar) leastSoFar = price;
            dailyProfit = price - leastSoFar;
            if (overallProfit < dailyProfit) overallProfit = dailyProfit;

        }
        return overallProfit;
    }
}







*/
/*  Time Limit berdi bu yechim chunki Runtime O(n^2)
  public int maxProfit(int[] prices) {
        if (prices.length == 2 && (prices[1] > prices[0])) return prices[1] - prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int a = prices[j] - prices[i];
                if (a > 0 && a > profit) {
                    profit = a;
                }
            }
        }
        return profit;
    }

            int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
            if(op < pist){ // if pist is more then our previous overall profit
                op = pist; // update overall profit
            }
        }
        return op; // return op

*/

