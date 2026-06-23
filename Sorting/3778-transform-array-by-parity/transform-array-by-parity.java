class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int i=0;
        for(int num:nums){
            if(num%2==0){
                ans[i]=0;
                i++;
            }
        }

        while(i<n){
            ans[i]=1;
            i++;
        }
        return ans;
    }
}