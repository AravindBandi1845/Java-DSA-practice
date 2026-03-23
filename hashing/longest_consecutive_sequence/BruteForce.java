class Solution {

    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int longest = 0;

        for(int i = 0; i < nums.length; i++){

            int current = nums[i];
            int streak = 1;

            while(arrayContains(nums, current + 1)){
                current = current + 1;
                streak = streak + 1;
            }

            longest = Math.max(longest, streak);
        }

        return longest;
    }
    public boolean arrayContains(int[] nums, int target){
        for(int num : nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}
