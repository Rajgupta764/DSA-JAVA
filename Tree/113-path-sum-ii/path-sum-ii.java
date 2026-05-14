class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPaths(root, targetSum, currentPath, ans);
        return ans;
    }

    private void findPaths(TreeNode root, int targetSum, List<Integer> currentPath, List<List<Integer>> ans) {
        if (root == null) return;

        currentPath.add(root.val);

        if (root.left == null && root.right == null && targetSum == root.val) {
            ans.add(new ArrayList<>(currentPath)); 
        } else {
            
            findPaths(root.left, targetSum - root.val, currentPath, ans);
            findPaths(root.right, targetSum - root.val, currentPath, ans);
        }

        
        currentPath.remove(currentPath.size() - 1);
    }
}