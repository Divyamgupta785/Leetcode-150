class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int price:prices){
            if(price<buyprice){
                buyprice = price;
            }else{
                maxprofit = Math.max(maxprofit,price-buyprice);
            }
        }
        return maxprofit;
    }
}