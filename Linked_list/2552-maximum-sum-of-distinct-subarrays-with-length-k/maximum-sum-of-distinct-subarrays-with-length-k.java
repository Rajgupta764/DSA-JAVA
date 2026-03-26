class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0; 
        long sum = 0; 
        Set<Integer> set = new HashSet<>();
        int left = 0;
        int n = nums.length;
        
        for (int right = 0; right < n; right++) {
            // 1. Duplicate check or Window full check
            while (set.contains(nums[right]) || set.size() == k) {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            // 2. Naya element pehle ADD karo
            sum += nums[right];
            set.add(nums[right]); // Yeh step sum ke baad hona chahiye

            // 3. Jab window exactly k size ki ho jaye, tabhi max update karo
            if (set.size() == k) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}