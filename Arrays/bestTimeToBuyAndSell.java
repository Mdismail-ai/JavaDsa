public class bestTimeToBuyAndSell {
    public static int  bestTimeToBuyAndSells(int prices[]){
    int bestBuy = prices[0];
    int maxProfit = 0;
    for(int i = 0; i < prices.length ; i++){
        if(prices[i]>bestBuy){
           maxProfit = Math.max(maxProfit, prices[i]-bestBuy);
        }
        bestBuy = Math.min(bestBuy, prices[i]);
    }
    return maxProfit;
    }
    public static void main(String[] args) {
       int nums[] = {7,1,5,3,6,4};
       System.out.println(bestTimeToBuyAndSells(nums));
    }
    
}

