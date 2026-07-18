class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long sum=0;
        long leftsum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<n-1;i++){
            leftsum+=nums[i];
            long rightsum=sum-leftsum;
            if(rightsum<=leftsum){
               count++;
            }
           
        }
        return count;
    }
}