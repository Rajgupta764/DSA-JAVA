class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        if(n == 0){
            return;
        }

        k = k % n;

        int temp[] = new int[k];

        // Store last k elements
        for(int i = 0; i < k; i++){
            temp[i] = nums[n-k+i];
        }

        // Shift remaining elements to the right
        for(int i = n-k-1; i >= 0; i--){
            nums[i+k] = nums[i];
        }

        // Put last k elements at the beginning
        for(int i = 0; i < temp.length; i++){
            nums[i] = temp[i];
        }
    }
}