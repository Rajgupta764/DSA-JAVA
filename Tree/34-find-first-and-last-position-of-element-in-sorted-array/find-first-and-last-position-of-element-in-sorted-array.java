class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=findfirst(nums,target);
        int second=findsecond(nums,target);
        return new int[]{first,second};
    }
    public static int findfirst(int nums[],int target){
        int first=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return first;
    }

    public static int findsecond(int nums[],int target){
        int second=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                second=mid;
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return second;
    }
}