import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {

            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {

                int required = -nums[i] - nums[j];

                if (seen.contains(required)) {

                    List<Integer> triplet = Arrays.asList(
                        nums[i],
                        nums[j],
                        required
                    );

                    Collections.sort(triplet);
                    uniqueTriplets.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(uniqueTriplets);
    }
}
