class Solution {
    public int differenceOfSum(int[] nums) {
        int actualsum=0;
        int n=nums.length;
        int fun=0;
        for(int i=0;i<n;i++){
            actualsum+=nums[i];
            fun+=sum(nums[i]);
        }
        return actualsum-fun;
        

    }
    public static int sum(int n){
           int sum=0;
           while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
            
           }
           return sum;
    }
}