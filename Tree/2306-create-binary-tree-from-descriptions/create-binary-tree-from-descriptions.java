class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> set=new HashSet<>();
        Map<Integer,TreeNode> map=new HashMap<>();
        for(int desc[]:descriptions){
            //for parent node
            if(!map.containsKey(desc[0])){
                map.put(desc[0],new TreeNode(desc[0]));
            }
            //for child node
            if(!map.containsKey(desc[1])){
                map.put(desc[1],new TreeNode(desc[1]));
            }
            if(desc[2]==1){
                map.get(desc[0]).left=map.get(desc[1]);
            }
            else{
                map.get(desc[0]).right=map.get(desc[1]);
            }
            set.add(desc[1]);
        }
        for(int desc[]:descriptions){
            if(!set.contains(desc[0])){
                return map.get(desc[0]);
            }
        }
        return null;
    }
}