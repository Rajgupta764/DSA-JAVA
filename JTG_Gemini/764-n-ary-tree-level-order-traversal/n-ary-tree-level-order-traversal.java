/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<Node> pq=new LinkedList<>();
        if(root==null){
            return ans;
        }
        pq.add(root);
        while(!pq.isEmpty()){
            int size=pq.size();
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node current=pq.poll();
                li.add(current.val);
                for(Node node:current.children){
                    pq.add(node);
                }
            }
            ans.add(li);
        }
        return ans;
    }
}