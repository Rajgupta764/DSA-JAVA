class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for (String s : tokens) {
            // Fix 1: Double quotes for String comparison
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                
                // Fix 2: Order of operands
                int valRight = st.pop(); // Pehla pop = right operand
                int valLeft = st.pop();  // Dusra pop = left operand

                if (s.equals("+")) st.push(valLeft + valRight);
                else if (s.equals("-")) st.push(valLeft - valRight);
                else if (s.equals("*")) st.push(valLeft * valRight);
                else if (s.equals("/")) st.push(valLeft / valRight);
            } 
            else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}