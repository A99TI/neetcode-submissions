class Solution {
    public int maxProfit(int[] prices) {

        int res = 0;
        int l = 0;
        int r = 0;

        while (l <= prices.length - 2){
            r = l + 1;
            while (r < prices.length && prices[r] - prices[l] > 0){
                res = Math.max(prices[r] - prices[l], res);
                r++; 
            }
            l = r;
        }

        return res;
        
    }
}
