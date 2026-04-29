class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        // Sabse badi pile dhundo (Maximum possible speed)
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canEatAll(piles, h, mid)) {
                ans = mid; // Ye speed kaam kar rahi hai, par kya isse kam ho sakti hai?
                high = mid - 1;
            } else {
                low = mid + 1; // Speed bohot kam hai, badhao!
            }
        }
        return ans;
    }

    // Helper function check karne ke liye ki speed k par kitne ghante lagenge
    public boolean canEatAll(int[] piles, int h, int k) {
        long totalHours = 0;
        for (int pile : piles) {
            // Ceiling division: (pile / k) ko round up karna hai
            totalHours += (pile + k - 1) / k; 
        }
        return totalHours <= h;
    }
}