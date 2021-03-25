class Solution {
    public int peakIndexInMountainArray(int[] nums) {
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i] > nums[i + 1]) {
    			return i;
    		}
    	}
    	return 0;
    }
}
