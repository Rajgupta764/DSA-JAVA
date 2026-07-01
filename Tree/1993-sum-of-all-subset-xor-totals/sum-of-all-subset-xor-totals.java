class Solution {
    public int subsetXORSum(int[] nums) {
        return findTotal(nums,0,0);
    }

    public static int findTotal(int nums[],int idx,int xor){
        if(idx==nums.length) return xor;
        int pick=findTotal(nums,idx+1,xor^nums[idx]);
        int noPick=findTotal(nums,idx+1,xor);
        return pick+noPick;
    }
}