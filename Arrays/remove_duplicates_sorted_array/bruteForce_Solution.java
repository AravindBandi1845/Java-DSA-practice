class Solution {
    public int removeDuplicates(int[] nums) {

        Set<Integer> set = new LinkedHashSet<>();

        // Step 1: Add elements (removes duplicates)
        for(int num : nums){
            set.add(num);
        }

        // Step 2: Put back into array
        int i = 0;
        for(int n : set){
            nums[i++] = n;
        }

        return i;
    }
}
