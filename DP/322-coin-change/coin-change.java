class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int ans[][]=new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            ans[i][0]=0;
        }
        for(int j=1;j<=amount;j++){
            ans[0][j]=amount+1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j){
                    ans[i][j]=Math.min(ans[i-1][j],1+ans[i][j-coins[i-1]]);
                }
                else {
                    ans[i][j]=ans[i-1][j];
                }
            }
        }
        return ans[n][amount]>amount?-1:ans[n][amount];
    }
}