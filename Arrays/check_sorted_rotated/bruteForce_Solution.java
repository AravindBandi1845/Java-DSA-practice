import java.util.*;

class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;

        int[] arr = nums.clone();
        Arrays.sort(arr);

        for(int i = 0; i < n; i++){

            boolean isMatch = true;

            for(int j = 0; j < n; j++){

                if(nums[j] != arr[(i + j) % n]){
                    isMatch = false;
                    break;
                }
            }

            if(isMatch) return true;
        }

        return false;
    }
}
