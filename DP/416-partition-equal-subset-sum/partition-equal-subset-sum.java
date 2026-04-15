class Solution {
    // Boolean array for memoization: 
    // null = not calculated, true/false = pre-calculated result
    private Boolean[][] memo;

    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Logic Step 1: If the total sum is odd, it's impossible to split equally.
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;
        int n = nums.length;
        
        // Logic Step 2: Initialize the memo table
        // Row: index in nums, Column: target sum remaining
        memo = new Boolean[n][target + 1];

        return solve(0, nums, target);
    }

    private boolean solve(int index, int[] nums, int currentTarget) {
        // BASE CASES
        if (currentTarget == 0) return true; // SUCCESS!
        if (index >= nums.length || currentTarget < 0) return false; // FAILURE!

        // DP STEP: Check if we already solved this exact sub-problem
        if (memo[index][currentTarget] != null) {
            return memo[index][currentTarget];
        }

        // OPTION 1: "PICK" the current number
        // We only pick it if it doesn't make the sum negative
        boolean pick = false;
        if (nums[index] <= currentTarget) {
            pick = solve(index + 1, nums, currentTarget - nums[index]);
        }

        // OPTION 2: "SKIP" the current number
        boolean skip = solve(index + 1, nums, currentTarget);

        // SAVE & RETURN: Store the result in memo before returning
        return memo[index][currentTarget] = pick || skip;
    }
}