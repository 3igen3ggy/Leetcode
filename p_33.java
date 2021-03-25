class Solution {
    public int search(int[] nums, int target) {
    	int len = nums.length;
    	if (nums[0] == target) return 0;
    	if (nums[len - 1] == target) return len - 1;
    	if (nums[0] > target) {
    		if (nums[len - 1] < target) return -1;
    		for (int i = len - 2; i >= 0 ; i--) {
    			if (nums[i] == target) return i;
    			if (nums[i] > nums[i + 1]) return -1;
    		}
    	}
    	if (nums[0] < target) { 
    		for (int i = 1; i < len; i++) {
    			if (nums[i] == target) return i;
    		}
    	}
    	return -1;
    }
}
