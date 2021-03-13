class Solution {
    public int firstMissingPositive(int[] nums) {
    	int len = nums.length;
    	if (len == 0) return 1;
    	if (len == 1 && nums[0] == 1) return 2;
    	int i = 1;
    	for (i = 1; i < len + 1; i++) {
    		if (!isIn(nums, i)) {
    			return i;
    		}
    	}
    	return i;   
    }
    
    public boolean isIn(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] == num) {
        		return true;
        	}
        }
        return false;
    }
}
