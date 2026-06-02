class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String ch:strs){
            char[] array=ch.toCharArray();
            Arrays.sort(array);
            String sorted=new String(array);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
         
            map.get(sorted).add(ch);
            
        }
        return new ArrayList<>(map.values());
    }
}