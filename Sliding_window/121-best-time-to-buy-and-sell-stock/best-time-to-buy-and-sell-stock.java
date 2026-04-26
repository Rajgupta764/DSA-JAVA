class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
             if(min>prices[i]){
                min=prices[i];
             }
             max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}