class Solution {
    // Static nahi, instance variable rakhein
    int maxheight = 0; 
    
    public int max(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        // Ek hi baar call karein
        int lefth = max(root.left);
        int righth = max(root.right);
        
        // Diameter update karein
        maxheight = Math.max(maxheight, lefth + righth);
        
        // Purane variables use karein, dobara function call na karein
        return 1 + Math.max(lefth, righth);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxheight = 0; // Har baar reset karna zaroori hai
        max(root);
        return maxheight;
    }
}