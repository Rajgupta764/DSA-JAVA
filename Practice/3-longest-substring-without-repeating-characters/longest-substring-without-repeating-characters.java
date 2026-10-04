class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int ans=0;
        Set<Character> set=new HashSet<>();
        for(int right=0;right<n;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                    left++;
            }
            ans=Math.max(ans,right-left+1);
            set.add(s.charAt(right));
            
        }
        return ans;
    }
}