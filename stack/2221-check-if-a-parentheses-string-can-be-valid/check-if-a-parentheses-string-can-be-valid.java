import java.util.Stack;

class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false; // Odd length can't be valid

        Stack<Integer> lockedStack = new Stack<>();
        Stack<Integer> unlockedStack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                unlockedStack.push(i);
            } else if (s.charAt(i) == '(') {
                lockedStack.push(i);
            } else { // It's a locked ')'
                if (!lockedStack.isEmpty()) {
                    lockedStack.pop();
                } else if (!unlockedStack.isEmpty()) {
                    unlockedStack.pop();
                } else {
                    return false; // Nothing to match this ')'
                }
            }
        }

        // Match remaining locked '(' with remaining unlocked chars
        while (!lockedStack.isEmpty() && !unlockedStack.isEmpty()) {
            if (lockedStack.peek() > unlockedStack.peek()) {
                // The '(' is to the right of the wildcard, cannot be closed!
                return false; 
            }
            lockedStack.pop();
            unlockedStack.pop();
        }

        // If lockedStack is empty, all fixed '(' are closed. 
        // Any remaining unlockedStack chars must be in pairs (which they will be, 
        // since the total length is even).
        return lockedStack.isEmpty();
    }
}