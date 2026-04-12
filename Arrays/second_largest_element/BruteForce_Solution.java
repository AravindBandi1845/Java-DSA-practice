class Solution {
    public int secondLargest(int[] nums) {

        if(nums.length < 2) return -1;

        Arrays.sort(nums); 

        int largest = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] != largest){
                return nums[i];
            }
        }

        return -1;
    }
}
