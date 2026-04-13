class Solution {
    public int rob(TreeNode root) {
        int[] result = helper(root);
        // Return the maximum of [robbed, not_robbed] at the root
        return Math.max(result[0], result[1]);
    }

    private int[] helper(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0}; // [robbed, not_robbed]
        }

        // Traverse down to the leaves first
        int[] left = helper(node.left);
        int[] right = helper(node.right);

        // result[0]: We rob this node
        // We MUST take the "not robbed" values from children
        int robThis = node.val + left[1] + right[1];

        // result[1]: We do NOT rob this node
        // We can take the maximum available from each child
        int skipThis = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{robThis, skipThis};
    }
}