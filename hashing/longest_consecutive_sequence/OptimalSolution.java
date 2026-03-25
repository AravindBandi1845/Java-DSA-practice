import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> box = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            box.add(nums[i]);
        }

        int longest = 0;

        for(int num : box){

            if(!box.contains(num - 1)){

                int currentNum = num;
                int currentStreak = 1;

                while(box.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}
