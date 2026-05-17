class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k){
                maxLength = i + 1;
            }
            if(map.containsKey(sum - k)){
                int length = i - map.get(sum - k);
                maxLength = Math.max(maxLength, length);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}
