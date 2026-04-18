class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // perform left rotation k times
        for(int i = 0; i < k; i++){
            leftRotateByOne(nums, n);
        }
    }

    private void leftRotateByOne(int[] nums, int n){

        int first = nums[0];

        for(int i = 0; i < n - 1; i++){
            nums[i] = nums[i + 1];
        }

        nums[n - 1] = first;
    }
}
