import java.util.Stack;

class Solution {
    public int maximumGain(String s, int x, int y) {
        int totalPoints = 0;
        String highPattern, lowPattern;
        int highPoints, lowPoints;

        // Step 1: Decide which pattern to chase first
        if (x > y) {
            highPattern = "ab"; highPoints = x;
            lowPattern = "ba"; lowPoints = y;
        } else {
            highPattern = "ba"; highPoints = y;
            lowPattern = "ab"; lowPoints = x;
        }

        // Step 2: First Pass (Remove high-value pairs)
        StringBuilder afterFirstPass = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == highPattern.charAt(0) && c == highPattern.charAt(1)) {
                stack.pop();
                totalPoints += highPoints;
            } else {
                stack.push(c);
            }
        }

        // Move remaining characters from stack back to a string for the second pass
        while (!stack.isEmpty()) afterFirstPass.append(stack.pop());
        // Note: The stack pops in reverse, but for the second pass, 
        // the order doesn't actually matter for "ab"/"ba" logic.
        // However, let's reverse it to be safe.
        String remaining = afterFirstPass.reverse().toString();

        // Step 3: Second Pass (Remove low-value pairs)
        for (char c : remaining.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == lowPattern.charAt(0) && c == lowPattern.charAt(1)) {
                stack.pop();
                totalPoints += lowPoints;
            } else {
                stack.push(c);
            }
        }

        return totalPoints;
    }
}