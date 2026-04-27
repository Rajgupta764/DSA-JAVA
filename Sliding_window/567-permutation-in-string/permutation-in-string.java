class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Pehle n1 characters ka frequency count le lo
        for (int i = 0; i < n1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Window ko slide karo s2 ke upar
        for (int i = 0; i <= n2 - n1; i++) {
            // Agar dono arrays same hain, matlab permutation mil gaya
            if (matches(count1, count2)) return true;

            // Window slide: agla character add karo, pichla remove karo
            if (i + n1 < n2) {
                count2[s2.charAt(i) - 'a']--; // Remove left
                count2[s2.charAt(i + n1) - 'a']++; // Add next right
            }
        }

        return false;
    }

    // Do arrays ko compare karne ke liye helper method
    private boolean matches(int[] c1, int[] c2) {
        for (int i = 0; i < 26; i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }
}