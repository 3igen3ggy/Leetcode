class Solution {
    public int maxProduct(int[] nums) {

        int max = nums[0];
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int prod = 1;

            for (int j = i; j < len; j++) {
                prod *= nums[j];
                if (prod > max) max = prod;
            }
        }
        return max;
    }
}
