class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Map<Integer, Integer> map = new HashMap<>(); // Element -> Its Next Greater
    Stack<Integer> st = new Stack<>();

    // nums2 par peeche se loop chalao
    for (int i = nums2.length - 1; i >= 0; i--) {
        int current = nums2[i];
        
        // Stack se chhote elements ko hatao
        while (!st.isEmpty() && st.peek() <= current) {
            st.pop();
        }
        
        // Map mein store karo: agar stack khali toh -1, nahi toh top element
        map.put(current, st.isEmpty() ? -1 : st.peek());
        
        // Current ko push karo stack mein
        st.push(current);
    }

    // nums1 ke liye answers map se uthao
    int[] res = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        res[i] = map.get(nums1[i]);
    }
    return res;
}
}