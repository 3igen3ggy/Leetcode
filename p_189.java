class Solution {
    public void rotate(int[] nums, int k) {
    	int len = nums.length;
    	if (len == 0 || len == 1) {}
            else {
    		k = k % len;
    	  	int[] memo = new int[k];
        	int counter = 0;
            for (int i = len - k; i < len; i++) {
            	memo[counter] = nums[i];
            	counter++;
            }
            for (int i = len - 1; i >= k; i--) {
            	nums[i] = nums[i - k];
            }
            for (int i = 0; i < k; i++) {
            	nums[i] = memo[i];
            }
    	  }
    }
}
