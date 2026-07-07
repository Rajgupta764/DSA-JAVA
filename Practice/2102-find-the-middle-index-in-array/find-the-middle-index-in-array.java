class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int leftsum=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<n;i++){
            int rightsum=sum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            else {
                leftsum+=nums[i];
            }
        }
        return -1;
    }
}