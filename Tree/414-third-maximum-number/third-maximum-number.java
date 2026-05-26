class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Integer first=null;
        Integer second=null;
        Integer third=null;
        for(int i=0;i<n;i++){
            if((first!=null && first==nums[i]) || (second!=null && second==nums[i]) || (third!=null && third==nums[i])){
                continue;
            }
            if(first==null || nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }
            else if(second==null || second<nums[i]){
                third=second;
                second=nums[i];
            }
            else if(third==null || third<nums[i]){
                third=nums[i];
            }
        }
        return third==null?first.intValue():third.intValue();
    }
}