class Solution {
    public String removeDigit(String number, char digit) {
        String maxResult = ""; // This will store our biggest result
        
        for (int i = 0; i < number.length(); i++) {
            // 1. Find if the current character is the digit we want to remove
            if (number.charAt(i) == digit) {
                
                // 2. Create a NEW string by skipping ONLY this one digit
                // We take everything BEFORE index i and everything AFTER index i
                String currentAttempt = number.substring(0, i) + number.substring(i + 1);
                
                // 3. Is this new number bigger than our current "max"?
                // If maxResult is empty, we just take the first one we find
                if (maxResult.equals("") || currentAttempt.compareTo(maxResult) > 0) {
                    maxResult = currentAttempt;
                }
            }
        }
        
        return maxResult;
    }
}