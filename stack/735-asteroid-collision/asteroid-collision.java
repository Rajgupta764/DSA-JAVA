import java.util.*;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // Handle collisions only if asteroid is moving left
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                if (Math.abs(asteroid) > top) {
                    stack.pop(); // right asteroid destroyed, keep checking
                } else if (Math.abs(asteroid) == top) {
                    stack.pop(); // both destroyed
                    asteroid = 0; // mark current asteroid destroyed
                    break;
                } else {
                    asteroid = 0; // left asteroid destroyed
                    break;
                }
            }
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
