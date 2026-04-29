class Solution {
    public int missingNumber(int[] nums) {
        int xorResult = 0;
        int n = nums.length;
        // XOR all numbers from 0 to n
        for(int i = 0; i <= n; i++){
            xorResult ^= i;
        }
        // XOR all elements in array
        for(int num : nums){
            xorResult ^= num;
        }
        return xorResult;
    }
}
