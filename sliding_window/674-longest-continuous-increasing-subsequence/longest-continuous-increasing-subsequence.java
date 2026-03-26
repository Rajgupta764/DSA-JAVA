class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int n=nums.length;
        int count=1;
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
               if(nums[i]>nums[i-1]){
                     count++;
               }
               else {
                count=1;
               }
               
               max=Math.max(max,count);
        }
        return max;
    }
}