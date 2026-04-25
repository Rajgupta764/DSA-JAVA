class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int current=0;
        int count=0;
        int max=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
              if(!set.contains(num-1)){
                current=num;
                count=1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                  max=Math.max(max,count);
              }
              
        }
        return max;
    }
}