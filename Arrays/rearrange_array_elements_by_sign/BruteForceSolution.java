class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Wrong sign at current index
            if ((i % 2 == 0 && nums[i] < 0) ||
                (i % 2 == 1 && nums[i] > 0)) {

                int next = i + 1;

                // Find the next element with the required sign
                while (next < n &&
                      ((i % 2 == 0 && nums[next] < 0) ||
                       (i % 2 == 1 && nums[next] > 0))) {
                    next++;
                }

                if (next < n) {
                    rightRotate(nums, i, next);
                }
            }
        }

        return nums;
    }

    private void rightRotate(int[] nums, int start, int end) {

        int temp = nums[end];

        for (int i = end; i > start; i--) {
            nums[i] = nums[i - 1];
        }

        nums[start] = temp;
    }
}
