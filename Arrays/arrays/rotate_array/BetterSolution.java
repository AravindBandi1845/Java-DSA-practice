class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        // Step 1: copy elements from k to end
        for(int i = k; i < n; i++){
            temp[i - k] = nums[i];
        }

        // Step 2: copy first k elements to end
        for(int i = 0; i < k; i++){
            temp[n - k + i] = nums[i];
        }

        // Step 3: copy back to original array
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
    }
}
