class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            
            currentGas += gas[i] - cost[i];

            // If we run out of gas at this station
            if (currentGas < 0) {
                // Reset: This start point and all before it are invalid
                startIndex = i + 1; 
                currentGas = 0;
            }
        }

        // Final Check: Is it even possible mathematically?
        if (totalGas < totalCost) {
            return -1;
        }

        return startIndex;
    }
}