package Day3;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int maxprofit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }

            int currentprofit = prices[i] - buy;
            maxprofit = Math.max(currentprofit, maxprofit);
        }

        return maxprofit;
    }

    public static void main(String[] args) {
        MaxProfit obj = new MaxProfit();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}