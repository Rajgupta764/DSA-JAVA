import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // 1. Pehle 'p' ki frequency aur 's' ki pehli window bhar lo
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // 2. Pehli window check karo
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // 3. Window ko slide karo
        for (int i = p.length(); i < s.length(); i++) {
            // Naya character add karo (Window ke aage wala)
            sCount[s.charAt(i) - 'a']++;
            
            // Purana character hatao (Window ke piche wala)
            sCount[s.charAt(i - p.length()) - 'a']--;

            // Check karo kya ab match ho raha hai
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}