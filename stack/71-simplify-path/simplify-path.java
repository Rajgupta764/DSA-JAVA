import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        // Step 1: Split by slash. Multiple slashes become empty strings.
        String[] parts = path.split("/");
        Stack<String> st = new Stack<>();

        for (String part : parts) {
            // Step 2: Process each part
            if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (part.equals(".") || part.isEmpty()) {
                // Ignore single dot or empty strings (from //)
                continue;
            } else {
                // Valid directory name
                st.push(part);
            }
        }

        // Step 3: Reconstruct the path
        StringBuilder result = new StringBuilder();
        for (String dir : st) {
            result.append("/").append(dir);
        }

        // Handle the case where the stack is empty (root directory)
        return result.length() == 0 ? "/" : result.toString();
    }
}