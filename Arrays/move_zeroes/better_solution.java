class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int lastNonZeroIndex = 0;

        // Step 1: move non-zero elements forward
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }

        // Step 2: fill remaining positions with zero
        for(int i = lastNonZeroIndex; i < n; i++){
            nums[i] = 0;
        }
    }
}
