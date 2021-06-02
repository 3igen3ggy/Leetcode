class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] maxArr = new int[len - k + 1];

        for (int i = 0; i < len - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < k; j++) {
                if (nums[i + j] > max) {
                    max = nums[i + j];
                }
            }
            maxArr[i] = max;
        }
        return maxArr;
    }
}
