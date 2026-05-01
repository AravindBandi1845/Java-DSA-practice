class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int max = 0;

        for(int i = 0; i < n; i++){

            int count = 0;

            for(int j = i; j < n; j++){

                if(nums[j] == 1){
                    count++;
                    max = Math.max(max, count);
                } else {
                    break; // stop when 0 appears
                }
            }
        }

        return max;
    }
}
