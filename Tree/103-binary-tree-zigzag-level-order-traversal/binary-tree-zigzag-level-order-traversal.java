/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        boolean lefttoRight=true;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<size;i++){
                   TreeNode  current=q.poll();
                   if(lefttoRight){
                        li.add(current.val);
                   }else {
                    li.add(0,current.val);
                   }
                   
                   if(current.left!=null) q.add(current.left);
                   if(current.right!=null) q.add(current.right);
            }
            lefttoRight=!lefttoRight;
            ans.add(li);
        }
        return ans;
    }
}