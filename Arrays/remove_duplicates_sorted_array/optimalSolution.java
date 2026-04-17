class Solution {
    public int removeDuplicates(int[] nums) {

        // pointer for unique elements
        int i = 0;

        // traverse using j
        for(int j = 1; j < nums.length; j++){

            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
