class Solution {
    public int maximumWealth(int[][] accounts) {
        //we need to find out the max from the given 2 d array
        int n=accounts.length;
        int m=accounts[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}