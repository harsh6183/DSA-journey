//Leetcode 121 Buy and sell stock calculate maxprofit
public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = { 2, 4, 6, 1, 9 };
        maxProfit(prices);  
    }

    public static void maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrices){
                minPrices=prices[i];
            }else if(prices[i]-minPrices>maxProfit){
                maxProfit=prices[i]-minPrices;
            }
        }
        System.out.println("MAXIMUM PROFIT IS :"+maxProfit);
    }
}
