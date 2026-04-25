import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency count store karo
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }
        
        // Step 2: Min-Heap banao (Frequency ke basis par)
        // (a, b) -> frequency comparison logic
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> countMap.get(a) - countMap.get(b)
        );
        
        // Step 3: Heap mein K elements rakho
        for (int num : countMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // Sabse kam frequency wala nikal jayega
            }
        }
        
        // Step 4: Result array mein convert karo
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        
        return result;
    }
}