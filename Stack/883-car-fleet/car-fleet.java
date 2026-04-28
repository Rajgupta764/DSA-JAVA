import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        // 1. Position aur Speed ka pair banao
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i]; // Time to reach target
        }

        // 2. Sort by Position (Ascending - Piche wali car se shuru karenge)
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));

        Stack<Double> stack = new Stack<>();

        // 3. Process cars from back to front
        for (int i = 0; i < n; i++) {
            double currentTime = cars[i][1];
            
            // Jab tak stack mein koi aage wali car hai jo humse dheere hai
            // (yani uska time humse zyada hai), tab tak hum unhe pop karenge 
            // kyunki hum unhe raste mein pakad lenge.
            while (!stack.isEmpty() && currentTime >= stack.peek()) {
                stack.pop();
            }
            stack.push(currentTime);
        }

        // Stack ka size hi total fleets hai
        return stack.size();
    }
}