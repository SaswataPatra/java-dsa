package DP;
public class Buy_sell_stock {

    public static int maxProfit(int prices[]){
        int max_profit =0;
        int b_stock = Integer.MAX_VALUE;

        for ( int i =0; i<prices.length;i++){
            if (prices[i]<b_stock){
                b_stock = prices[i];
            }
            int profit = prices[i] - b_stock;
            if(max_profit<profit){
                max_profit = profit;
            }
        }
        return max_profit;
    }
    public static void main(String[]args){
        int prices[] = {7,6,4,3,1};
        int max_profit = maxProfit(prices);
        System.out.println(max_profit);
    }
}
