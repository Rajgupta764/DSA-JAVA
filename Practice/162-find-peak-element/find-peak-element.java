class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int peak=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                peak=i;
            }
        }
        return peak;
    }
}