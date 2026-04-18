class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int ans[][]=new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            ans[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]>j){
                    ans[i][j]=ans[i-1][j];
                }
                else {
                    ans[i][j]=ans[i-1][j]+ans[i][j-coins[i-1]];
                }
            }
        }
        return ans[n][amount];
    }
}