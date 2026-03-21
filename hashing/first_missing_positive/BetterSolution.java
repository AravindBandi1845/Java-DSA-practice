import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        // Add all elements to HashSet
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        // Find smallest missing positive
        int i = 1;
        while(set.contains(i)){
            i++;
        }

        return i;
    }
}
