class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[k];
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int x:map.keySet()){
            pq.add(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
        
    }
}