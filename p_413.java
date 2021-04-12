class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        int counter = 0;
        for (int i = 1; i < len - 1; i++) {
        	int r = nums[i] - nums[i - 1];
        	for (int j = i + 1; j < len; j++) {
        		if (nums[j] - nums[j - 1] == r) {
        			counter++;
        		} else break;
        	}
        }
        return counter;
    }
}
