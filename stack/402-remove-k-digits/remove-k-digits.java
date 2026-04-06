import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (k == n) return "0"; // Remove everything

        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            char current = num.charAt(i);
            
            // While we still have "removals" left AND 
            // the current digit is smaller than the previous one...
            while (k > 0 && !st.isEmpty() && st.peek() > current) {
                st.pop();
                k--;
            }
            st.push(current);
        }
        
        // If k is still > 0, remove from the end (e.g., num="123", k=1)
        while (k > 0) {
            st.pop();
            k--;
        }
        
        // Build the string from stack
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse(); // Stack was Last-In-First-Out, so reverse it
        
        // Remove leading zeros (e.g., "0200" -> "200")
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}