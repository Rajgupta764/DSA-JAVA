class Solution {

    int count = 0;

    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return count;
    }

    private List<Integer> dfs(TreeNode root, int distance) {

        List<Integer> list = new ArrayList<>();

        // Base case
        if (root == null) {
            return list;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            list.add(0);
            return list;
        }

        // Get distances from left and right subtrees
        List<Integer> left = dfs(root.left, distance);
        List<Integer> right = dfs(root.right, distance);

        // Check every pair
        for (int l : left) {
            for (int r : right) {
                if (l + r + 2 <= distance) {
                    count++;
                }
            }
        }

        // Send updated distances to parent
        for (int l : left) {
            list.add(l + 1);
        }

        for (int r : right) {
            list.add(r + 1);
        }

        return list;
    }
}