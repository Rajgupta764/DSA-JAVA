class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(map.get(a).equals(map.get(b))){
                return b.compareTo(a);
            }
            else {
                return map.get(a)-map.get(b);
            }
        });
        for(String key:map.keySet()){
               pq.add(key);
               if(pq.size()>k){
                pq.poll();
               }
        }
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}