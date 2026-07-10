import java.util.*;

class Solution {

    public void nextPermutation(int[] nums) {

        List<List<Integer>> permutations = new ArrayList<>();

        generateAllPermutations(nums, 0, permutations);

        // Sort permutations lexicographically
        permutations.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        // Current permutation
        List<Integer> current = new ArrayList<>();
        for (int num : nums) {
            current.add(num);
        }

        // Find current permutation and replace with next
        for (int i = 0; i < permutations.size(); i++) {

            if (permutations.get(i).equals(current)) {

                List<Integer> next =
                        permutations.get((i + 1) % permutations.size());

                for (int j = 0; j < nums.length; j++) {
                    nums[j] = next.get(j);
                }

                return;
            }
        }
    }

    private void generateAllPermutations(int[] nums,
                                         int start,
                                         List<List<Integer>> permutations) {

        if (start == nums.length) {

            List<Integer> permutation = new ArrayList<>();

            for (int num : nums) {
                permutation.add(num);
            }

            permutations.add(permutation);
            return;
        }

        for (int i = start; i < nums.length; i++) {

            swap(nums, start, i);

            generateAllPermutations(nums, start + 1, permutations);

            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
