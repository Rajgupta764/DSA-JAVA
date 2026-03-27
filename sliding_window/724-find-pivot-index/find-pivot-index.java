class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int lefttotal=0;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<n;i++){
            int righttotal=sum-lefttotal-nums[i];
            if(lefttotal==righttotal){
                return i;
            }
            else {
                lefttotal+=nums[i];
            }
        }
        return -1;
    }
}