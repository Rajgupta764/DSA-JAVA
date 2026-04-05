class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int secondElement=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<secondElement){
                return true;
            }
            while(!st.isEmpty() && nums[i]>st.peek()){
                secondElement=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}