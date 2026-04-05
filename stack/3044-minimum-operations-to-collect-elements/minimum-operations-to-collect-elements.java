import java.util.*;

class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> collected = new HashSet<>();
        int n = nums.size();
        int operations = 0;

        // Start from the end of the list
        for (int i = n - 1; i >= 0; i--) {
            operations++; // Every element we look at counts as an operation
            
            int current = nums.get(i);
            
            // If the element is part of the 1...k range, collect it
            if (current <= k) {
                collected.add(current);
            }

            // Once we have all k elements, we are done!
            if (collected.size() == k) {
                return operations;
            }
        }

        return operations;
    }
}